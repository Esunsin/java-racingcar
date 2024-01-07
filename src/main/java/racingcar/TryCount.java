package racingcar;

public class TryCount {

	final int value;

	public TryCount(String value) {
		try {
			this.value = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
		}
	}
}
