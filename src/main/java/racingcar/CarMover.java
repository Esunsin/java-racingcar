package racingcar;

import java.io.InputStream;

public class CarMover {
	private final Cars cars;

	public CarMover(Cars cars) {
		this.cars = cars;
	}

	public Cars moveCars(TryCount tryCount){
		for (int i = 0; i < tryCount.value; i++) {
			move();
			printStatus();
		}
		return cars;
	}

	private void printStatus() {
		for (Car car : cars) {
			car.showHowForward();
		}
		System.out.println();
	}

	private void move() {
		for (Car car : cars) {
			car.move();
		}
	}

}
