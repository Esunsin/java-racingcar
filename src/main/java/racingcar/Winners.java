package racingcar;

import java.util.ArrayList;

public class Winners {

	private Cars values;

	public Winners(Cars cars) {
		this.values = cars;
	}

	public void showResult() {
		System.out.print("최종 우승자 :");
		values.printStatus();
	}

	public Winners findWinners(int maxPosition) {
		Cars winners = new Cars(new ArrayList<>());
		return new Winners(new Cars(winners.findByPosition(maxPosition)));
	}
}
