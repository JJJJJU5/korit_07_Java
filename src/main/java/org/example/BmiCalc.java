package org.example;

import ch18_static.builders.PersonLombok;
import lombok.Builder;
import lombok.Getter;

import java.util.Scanner;
@Builder
@Getter
public class BmiCalc {
    // #3 call3()형태
    public static void calcBmi(String name, double height, double weight) {
    // method 정의 할 때 argument와 parameter 개념을 혼동하는경우
    // 정의 -> 호출이라는 순서가 있을 때
    // 소괄호 내에 있는 매개변수 목록들은 자료형 + (임의의) 변수명으로 이루어져
    // 있기 때문에 '선언'이라고 간주하면

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하시오 >>> ");
//        name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하시오 >>> ");
//        height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        weight = scanner.nextDouble();

        double bmi = weight / ((height * height)*0.0001);
        String result;

        if (bmi >= 35 ) {
            result = " 3단계 비만";

        } else if(bmi >= 30 ) {
            result ="2단계 비만";
        } else if (bmi >= 25) {
            result ="1단계 비만";
        } else if (bmi >= 23) {
            result ="비만 전 단계 ";
        } else if(bmi >=  18.5) {
            result = "정상";
        } else {
            result ="저체중";
        }
        System.out.println(name +"님의 BMI 지수는 " + bmi + " 이므로 " + result + "입니다"  );

    }
    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public void calcBmi(Person person) {
        // Person class 의 각 field들에 private를 적용했기 때문에 값을 불러오기 위해서는
        // Getter를 사용해야만 함. 하지만 코드가 너무 길어지기 떄문에. 지역변수선언 -> 값을 대입하여 사용
        double height = person.getHeight();
       double weight = person.getWeight();
       String name = person.getName();
        double bmi = weight / ((height * height)*0.0001);
        String result;
        if (bmi >= 35 ) {
            result = " 3단계 비만";

        } else if(bmi >= 30 ) {
            result ="2단계 비만";
        } else if (bmi >= 25) {
            result ="1단계 비만";
        } else if (bmi >= 23) {
            result ="비만 전 단계 ";
        } else if(bmi >=  18.5) {
            result = "정상";
        } else {
            result ="저체중";
        }
        System.out.println(name +"님의 BMI 지수는 " + bmi + " 이므로 " + result + "입니다"  );
    }
    //#2 call1()
//   public BmiCalc() {
//       Scanner scanner = new Scanner(System.in);
//
//       System.out.print("이름을 입력하시오 >>> ");
//       String name = scanner.nextLine();
//
//       System.out.print("키(cm)를 입력하시오 >>> ");
//       double height = scanner.nextDouble() * 0.01;
//
//       System.out.print("몸무게(kg)를 입력하세요 >>> ");
//       double weight = scanner.nextDouble();
//
//       double bmi = weight / (height * height);
//       String result = "";
//
//       if (bmi >= 35 ) {
//           result = " 3단계 비만";
//
//       } else if(bmi >= 30 ) {
//           result =" 2단계 비만";
//       } else if (bmi >= 25) {
//           result =" 1단계 비만";
//       } else if (bmi >= 23) {
//           result =" 비만 전 단계 ";
//       } else if(bmi >=  18.5) {
//           result = " 정상";
//       } else {
//           result ="저체중";
//       }
//       System.out.println(name +"님의 BMI 지수는 " + bmi + " 이므로" + result + "입니다"  );
//    }


    public static void main(String[] args) {
       //1
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("이름을 입력하시오 >>> ");
//        String name = scanner.nextLine();
//
//        System.out.print("키(cm)를 입력하시오 >>> ");
//        double height = scanner.nextDouble() * 0.01;
//
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        double weight = scanner.nextDouble();
//
//        double bmi = weight / (height + height);
//        String result = "";
//
//        if (bmi >= 35 ) {
//            result = " 3단계 비만";
//
//        } else if(bmi >= 30 ) {
//            result =" 2단계 비만";
//        } else if (bmi >= 25) {
//            result =" 1단계 비만";
//        } else if (bmi >= 23) {
//            result =" 비만 전 단계 ";
//        } else if(bmi >=  18.5) {
//            result = " 정상";
//        } else {
//            result ="저체중";
//        }
//
//        System.out.println(name +"님의 BMI 지수는 " + bmi + " 이므로" + result+ "입니다"  );

//        BmiCalc bmiCalc1 = new BmiCalc();
//
//        bmiCalc1.calcBmi("김범수",180,90);

        BmiCalc bmiCalc = new BmiCalc();

    // 여기에 Person 객체를 생성해야 하는데 , 일반적인 방식이 아니라
    // Builder 패턴을 적용한 방식으로 생성해서 caclBmi() 메서드의 argument로
    // caclBmi() 메서드의 argument로 넣어줘야 함
//        System.out.println("-------------call3()-1- 검증부분 -------------");
//        calcBmi("김병만",172,68);
//

        System.out.println("--------------------객체 생성 후 call3()활용 방법 ------------");
        // 1. Person 객체 생성
        // 1-1 원래 객체 생성 방법
//        Person person1 =new Person("김사",172,68);
//        System.out.println(person1);
        // 1-2 Builder 패턴 사용 객체 생성
//        Person person2 = Person.builder().name("김오").height(172).weight(68).build();
//        bmiCalc.calcBmi(person2);

        System.out.println("----------scanner에 객체 사용 예시-------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하시오 >>> ");
        String name4 = scanner.nextLine();

        System.out.print("키(cm)를 입력하시오 >>> ");
        double height4 = scanner.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        double weight4 = scanner.nextDouble();
        Person person3 = Person.builder().weight(weight4).name(name4).height(height4).build();

        bmiCalc.calcBmi(person3);
    }
}
