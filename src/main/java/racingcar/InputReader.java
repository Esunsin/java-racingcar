package racingcar;

import java.util.Scanner;

public class InputReader {

	public InputReader() {
	}

	public String getCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
		Scanner input = new Scanner(System.in);
		return input.next();
	}

	public TryCount getTryCount() {
		Scanner tryCountString = new Scanner(System.in);
		return new TryCount(tryCountString.next());
	}

}
