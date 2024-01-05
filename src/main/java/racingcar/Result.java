package racingcar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    private final List<Car> cars = new ArrayList<>();

    public void judgeResult(List<Car> cars){
        int max = 0;
        for (Car car : cars) {
            if(car.getPosition() > max) max = car.getPosition();
        }
        for (Car car : cars) {
            if(car.getPosition() == max) this.cars.add(car);
        }
    }
    public void showResult(){
        System.out.print("최종 우승자 :");
        for (Car car : cars) {
            System.out.println(" "+car.getName());
        }
    }
}
