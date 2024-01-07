package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//car를 만드는 것을 생각해서 클래스 선언
public class GameStarter {
    void start(){
        Scanner input = new Scanner(System.in);

        String[] carNames = getPlayerName(input);

        List<Car> cars = getPlayerCar(carNames);

        int tryNumber = getTryNumber(input);

        play(cars, tryNumber);

        Judgement judgement = new Judgement();
        judgement.judgeResult(cars);
        judgement.showResult();
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

    //하나의 도메인으로 나누는 것 : 게임 스타트에 핵심 비즈니스 로직인데 내부를 살펴봐야함. -> 살펴보지 않아도 알 수 있게 만들어야함.
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
