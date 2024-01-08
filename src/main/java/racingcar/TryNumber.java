package racingcar;

import java.util.Scanner;

public class TryNumber {
    private int value;

    public TryNumber() {
    }
    public int createTryNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            value = scanner.nextInt();
        }catch (Exception e){
            throw new IllegalArgumentException("[ERROR]");
        }
        return value;
    }
}
