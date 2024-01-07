package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    // 추가 기능 구현
    public int move(){
        if(isForward()){
            position++;
        }
        return position;
    }
    public void showHowForward(){
        System.out.print(name + " : ");
        for(int i = 0 ; i < position ; i++){
            System.out.print("-");
        }
        System.out.println();
    }



    private boolean isForward(){
        int randomNumber = Randoms.pickNumberInRange(1, 9);;
        if(randomNumber >= 4) return true;
        return false;
    }
}
