package racingcar;

public class Judgement {
	// 일급객체로 만드는 것을 고려
	private final Cars cars;
	private Winners winners;

	public Judgement(Cars cars) {
		this.cars = cars;
	}

	public void judgeResult() {
		final int maxPosition = getMaxPosition(cars);
		saveWinners(cars, maxPosition);
	}

	public void showResult() {
		winners.showResult();
	}

	private void saveWinners(Cars cars, int max) {
		this.winners = new Winners(cars).findWinners(max);
	}

	private int getMaxPosition(Cars cars) {
		int max = 0;
		for (Car car : cars.values) {
			if (car.getPosition() > max)
				max = car.getPosition();
		}
		return max;
	}
}
