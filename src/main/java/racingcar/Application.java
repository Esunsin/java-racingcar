package racingcar;

public class Application {
    public static void main(String[] args) {

        GameStarter gameStarter = new GameConfiguration().configure();

        gameStarter.start();
    }

}

