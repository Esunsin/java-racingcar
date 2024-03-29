package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    // 추가 기능 구현
    public int randomForward(int tryCount){
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
        //System.out.print(" / position = " + position);
        System.out.println();
    }



    private boolean isForward(){
        int randomNumber = Randoms.pickNumberInRange(1, 9);;
        if(randomNumber >= 4) return true;
        return false;
    }
}
