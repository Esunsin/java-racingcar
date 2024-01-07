package racingcar;

public class GameConfiguration {

	public GameStarter configure() {
		return new GameStarter(new InputReader());
	}

}
