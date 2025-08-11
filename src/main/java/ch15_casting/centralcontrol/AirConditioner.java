package ch15_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("에어컨을 끕니다");
    }

    //downcasting에 앞서 고유 메서드를 하나 정의
    public void changeMode(){
        System.out.println("에어컨의 모드 변경");
    }
}
