package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Judgement {
    //일급객체로 만드는 것을 고려
    private final List<Car> winners = new ArrayList<>();

    public void judgeResult(MakerCars player){
        final int maxPosition = getMaxPosition(player.getPlayers());
        saveWinners(player, maxPosition);
    }

    public void showResult(){
        System.out.print("최종 우승자 :");
        for (Car winner : winners) {
            System.out.println(" "+winner.getName());
        }
    }

    private void saveWinners(MakerCars player, int max) {
        for (Car car : player.getPlayers()) {
            if(car.getPosition() == max) this.winners.add(car);
        }
    }

    private int getMaxPosition(List<Car> cars){
        int max=0;
        for (Car car : cars) {
            if(car.getPosition() > max) max = car.getPosition();
        }
        return max;
    }
}
