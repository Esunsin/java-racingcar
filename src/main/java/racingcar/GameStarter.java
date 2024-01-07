package racingcar;

//car를 만드는 것을 생각해서 클래스 선언
public class GameStarter {

    private final InputReader inputReader;

    public GameStarter(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    void start(){
        Cars cars = new CarMaker(inputReader.getCarNames()).makeCars();

        CarMover carMover = new CarMover(cars);
        Cars movedCars = carMover.moveCars(inputReader.getTryCount());

        Judgement judgement = new Judgement(movedCars);
        judgement.judgeResult();
        judgement.showResult();
    }
}
