package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        //객체 생성
        ClassA classA = new ClassA();

        //그리고 객체의 메서드(기능)을 호출

        //ClassA에 선언된 변수들에 값을 대입하겠습니다.

        // 객체명.속성명 = 데이터;
        classA.num =1;
        classA.name = "김일";
        classA.score = 4.2;

        System.out.println(classA.name + " 학생의"+
            "학번은" + classA.num + "번 이고, 점수는 "
            + classA.score + "점입니다."
        );

        //메서드 호출 방법
        //객체명.메서드명();
        classA.callName(); // scanner.next():와 같은 방식 호출하는 개념

        //car / Carmain


    }
}
