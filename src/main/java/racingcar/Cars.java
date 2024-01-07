package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	final List<Car> values;

	public Cars(List<Car> values) {
		this.values = values;
	}

	public void printStatus() {
		for (Car car : values) {
			System.out.println(car);
		}
		System.out.println();
	}

	public List<Car> findByPosition(int max) {
		List<Car> cars = new ArrayList<>();

		return cars;
	}




}
