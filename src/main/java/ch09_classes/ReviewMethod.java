package ch09_classes;

import java.util.Scanner;

public class ReviewMethod {
    // 메서드 정의 영역
/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
        저희는 call1() - call4()로, 매개변수 유무 / return 유무로 구분했습니다.

    형식:
        (접근지정자) 리턴타입 메서드명(매개변수1, 매개변수2) {
            메서드 내부에서 순차적으로 실행될 코드를 -> 이 묶음을 비지니스 로직이라고 하기도 한다.
        }
    예시:
    정의 예시
        public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케줄은 다음과 같습니다.")"
        System.out.println(content)"
        }
    호출 예시 :
        객체명 :writeSchedule("20250804","메서드/오버로딩/클래스 복습");


     */
    int num;

    public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }

    public void writeSchedule(int date, String content) { //1/
        System.out.println(date + "일의 스케줄은 다음과 같습니다.");
        System.out.println(content);
    }
    void dividedBySeven() { // call1()유형으로 정의
        int num = 0;

        Scanner scanner = new Scanner(System.in);
        ReviewMethod reviewMethod = new ReviewMethod();
        System.out.println("임의의 숫자를 입력하세요 >> ");
        num = scanner.nextInt();   // 이거 method의 return값이 num이라는 변수에 저장되는 것
        String answer = "";
        if (num % 7 == 0) {
            answer = "7의 배수입니다";
        } else {
            answer = "7의 배수가 아닙니다";
        }
        dividedBySeven(num); //method 내부에서 다른 method를 호출하는 것이 가능하다.


    }
    void dividedBySeven(int num) {
        //지역 변수 선언
        String answer;
        if (num % 7 == 0) {
            answer = "";
            answer = "7의 배수입니다";
        } else {
            answer = "7의 배수가 아닙니다";
        }
        System.out.println(num + "(은)는" + answer);
    }

    //1. writeSchedule을 overloading하여 매게변수1의 자료형을 int로 바꾸고,
    // writeSchedule(20250805 , "클래스/getter/setter 예습 "); 을 호출하시오

    //2. call2() 유형으로 작성. -> mian에 어떻게 쓸지, 아닐지 고민
    // dividedBySeven 메서드를 정의
    // 특정 int 숫자 하나를 매개변수로 받아, 그 숫자가 7의 배수인지 아닌지를 확인하는 메서드를
    // 작성
    // 실행 예
    // 임의의 숫자를 입력하세요 >> 77
    // 77은 7의 배수입니다.
    // 임의의 숫자를 입력하세요 >>> 100
    // 100은 7의 배수가 아닙니다.
    //3. call1()유형으로 작성

    public static void main(String[] args) {
        // 메서드 호출 }
        //2. dividedBySeven
       // Scanner scanner = new Scanner(System.in);
        ReviewMethod reviewMethod = new ReviewMethod();
        //int num = 0;
       // System.out.println("임의의 숫자를 입력하세요 >> ");
       // num = scanner.nextInt();
        //reviewMethod.dividedBySeven(num);
        reviewMethod.dividedBySeven();











    }
}