package ch23_lambda;

public class CalculatorMain {

    // 정적 메서드 정의
    public static int operate(int a , int b, Calculator c) {
        return c.calculator(a,b);
    }


    public static void main(String[] args) {
        // 정의한 interface calculator
        // 근데 인터페이스 내부에는 두 개의 매개변수만 정의되어 있음
        // 여기서 추가적인 조작을 통해 사칙 연산을 시도
        Calculator add = (x,y) -> x + y;       // Calculator 인터페이스의 객체명이 add고, 내부 메서드는 calculate()
        Calculator sub = (x,y) -> x - y;       // Calculator 인터페이스의 객체명이 sub고, 내부 메서드는 calculate()
        Calculator mul = (x,y) -> x * y;
        Calculator div = (x,y) -> x / y;


        System.out.println(add.calculator(2,3));          // 15번 라인 주석을 참고 했을 때 올바른 메서드 호출 방식
        System.out.println(sub.calculator(2,3));
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2,3,add)); // static method의
        // 세번째 매개변수로 Calculator 인터페이스의 서브 클래스를 받습니다.
       // 그리고 return 문을 보면 해당 객체의 .claculate() 메서드를 호출하는 것을 확인 할 수 있음
        // add.calculator()는 return이 x + y니까 , 결과값이 5가 나옴
        // 24번 코드라인 해석을 위해
        // calculator 인터페이스와, CalculatorMain의 static method 와 , 그리고 main에서 lambda식을 전부
        // 왔다갔다 하면서 볼 필요가 있음
        System.out.println("2 * 3 =" + operate(2,3,mul));



    }
}
