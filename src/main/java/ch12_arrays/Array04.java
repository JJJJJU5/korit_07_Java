package ch12_arrays;

import java.util.Scanner;

/*
    main에서 사용하는 불특정 Stringp[] 배열은 argument로 하는 메서드를 호출햇을 때
    String[] 내부의 element들을 한 줄로 출력하는 method를 정의하는 것이 목표


    다음 목표
    main에서 사용하는 불특정 String[] 배열을 argument로 하는 메서드를 호출했을 때
    String[] 내부 element들의 값을 하나하나 다 입력 받아서 바꾸는 method를
    정의하는 것
 */
public class Array04 {
    //메서드 정의 영역
    public void printElement() {
        String[] names = {"김일", "김이", "김삼", "김사", "김오",};
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

    }
    public  void printElement(String[] strArray){
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }
    public  void printElement(int[] strArray){
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");

        }
    }
    public  void printElement(double[] doublesArray){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < doublesArray.length; i++) {
            System.out.print(doublesArray[i] + "입력하시오 >>> ");
            doublesArray[i] = scanner.nextDouble();
        }
    }


    //입력 관련 method 정의
    public void writesElements(String[] strArray) {
        //여기서 스캐너를 import하고 , 매개변수로 맡은 배열에 값을 입력 할 수
        // 있도록 하는 method 정의
        Scanner scanner = new Scanner(System.in);

        for (int i = 0 ; i < strArray.length; i++) {
            System.out.println(" 번호를 입력하시오");
            strArray[i] = scanner.next();

        }


    }



    public static void main(String[] args) {
        // 메서드 호출 영역
        String[] people = new String[5];
        double scores[] = new double[2];
        //여기에 객체 생성하고 메서드 호출해서 김일 김이 ... 김육을 출력하시오

        Array04 array04 = new Array04();
        array04.writesElements(people);
        array04.printElement(people);
        System.out.println();




//        String[] students = { "이일","이이","이삼","이사","이오",};
//
//        array04.printElement(students);
//        System.out.println();
//
//        String[] teachers = { "안일", "안이","안삼","안사","안어" ,};
//        array04.printElement(teachers);
//        System.out.println();
//
//        int[] dates = { 2025 , 8 ,5};
//        array04.printElement(dates);
//
//        array04.printElement(scores);






    }
}
