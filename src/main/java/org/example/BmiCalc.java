package org.example;

import ch18_static.builders.PersonLombok;
import lombok.Builder;

import java.util.Scanner;
@Builder
public class BmiCalc {

    public static void calcBmi(String name, double height, double weight) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하시오 >>> ");
//        name = scanner.nextLine();
//        System.out.print("키(cm)를 입력하시오 >>> ");
//        height = scanner.nextDouble() * 0.01;
//        System.out.print("몸무게(kg)를 입력하세요 >>> ");
//        weight = scanner.nextDouble();

        double bmi = weight / ((height * height)*0.0001);
        String result = "";

        if (bmi >= 35 ) {
            result = " 3단계 비만";

        } else if(bmi >= 30 ) {
            result =" 2단계 비만";
        } else if (bmi >= 25) {
            result =" 1단계 비만";
        } else if (bmi >= 23) {
            result =" 비만 전 단계 ";
        } else if(bmi >=  18.5) {
            result = " 정상";
        } else {
            result ="저체중";
        }
        System.out.println(name +"님의 BMI 지수는 " + bmi + " 이므로 " + result + "입니다"  );

    }

    //2
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







    }
}
