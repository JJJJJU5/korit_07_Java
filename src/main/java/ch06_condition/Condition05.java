package ch06_condition;


import java.util.Scanner;


public class Condition05 {
    public static void main(String[] args) {
        /*
            사용자에게 score을 입력 받아 다음과 같은 조건을 만족시키도록 작성하시오.
            score가 90점 이상이라면 grade는 A
            score가 80점 이상이라면 grade는 B
            score가 70점 이상이라면 grade는 C
            score가 60점 이상이라면 grade는 D
            score가 59점 이하이라면 grade는 F

            실행 예
            점수를 입력하시오 >>> 46
            당신의 점수는 68점이고, 학점은 D입니다.

         */
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String usergrade = "";
        System.out.println(" 점수를 입력하세요 >>>");
        score = scanner.nextInt();

        if (score >= 90) {
            usergrade = "A";
        }else if (score >= 80) {
            usergrade = "B";
        } else if (score >= 70) {
            usergrade = "C";
        }else if (score >= 60) {
            usergrade = "D";
        }else  {
            usergrade = "F";
        }
        System.out.print("당신의 스코어는 " + score + " 이고" + " 당신의 학점은 " + usergrade + "입니다");

    }
}




