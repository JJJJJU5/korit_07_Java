package ch06_condition;

import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condition05의 코드는
    100초과 / 0미만의 점수가 입력됐을 때 각각 A / F라는 결과값이 나오게됩니다.
    에초에 잘못된 점수를 입력했을 떄 불가능한 점수 입력이라고 안내를 하려면 어떻게 할 수 있을까요?
    100 초과 / 0미만의 경우 grade 를 X라고 지정

    참고 사항 : 중첩 if문을 사용하지 않고 작성

 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.println(" 점수를 입력하세요 >>>");
        score = scanner.nextInt();

        if (score > 100 || score < 0 ) { // && = and  || = or  / 얘가  false라면 score는 0점 이상이면서 100 이하
            grade = "X";
        }
        else if (score >= 90) {
            grade = "A";
        }
        else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }else if (score >= 60) {
            grade = "D";
        }else  {
                grade = "F";


        }
        System.out.print("당신의 스코어는 " + score + " 이고" + " 당신의 학점은 " + grade + "입니다");

    }
}
