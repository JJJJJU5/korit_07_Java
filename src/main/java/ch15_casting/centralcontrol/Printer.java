package ch15_casting.centralcontrol;

public class Printer implements Power{
    @Override
    public void on() {
        System.out.println("프린터를 실행");
    }

    @Override
    public void off() {
        System.out.println("프린터를 종료");
    }
    public void print() {
        System.out.println("프린터가 인쇄를 합니다.");
    }
}
