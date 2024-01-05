package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameStarter {
    void start(){
        Scanner scanner = new Scanner(System.in);

        String[] carNames = getPlayerName(scanner);

        List<Car> cars = getPlayerCar(carNames);

        Result result = new Result();

        int tryNumber = getTryNumber(scanner);

        play(cars, tryNumber);
        result.judgeResult(cars);
        result.showResult();
    }

    private String[] getPlayerName(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String racingCarNames = scanner.next();
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

    private int getTryNumber(Scanner scanner) {
        System.out.println("시도할 회수는 몇회인가요?");
        int tryNumber = scanner.nextInt();
        System.out.println();
        return tryNumber;

    }

    private void play(List<Car> cars, int tryNumber) {
        System.out.println("실행 결과");
        for(int i = 0; i < tryNumber; i++) {
            for (Car car : cars) {
                car.randomForward(tryNumber);
                car.showHowForward();
            }
            System.out.println();
        }
    }
}
