package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakerCars {

    private List<Car> players = new ArrayList<>();

    public List<Car> getPlayers() {
        return players;
    }

    public void createPlayer(){
        String[] playerName = getPlayerName();
        this.players = getPlayerCar(playerName);
    }

    private String[] getPlayerName() {
        Scanner input = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String racingCarNames = input.next();
        String[] carNames = racingCarNames.split(",");
        return carNames;
    }

    private List<Car> getPlayerCar(String[] carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }
}
