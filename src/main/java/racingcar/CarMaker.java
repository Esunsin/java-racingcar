package racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarMaker {
	private String input;

	public CarMaker(String input) {
		this.input = input;
	}

	public Cars makeCars() {
		String[] carNames = input.split(",");
		List<Car> cars = new ArrayList<>();
		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
		return new Cars(cars);
	}



}
