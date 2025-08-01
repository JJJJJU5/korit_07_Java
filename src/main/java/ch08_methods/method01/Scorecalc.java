package ch08_methods.method01;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균을 내는 프로그램 작성

 */
// 3 과목의 점수를 입력 받아서, 총합과 평균점수를
// 콘솔창에 표시하시오
        /*
            실행 예
            몇 과목의 점수를 입력하시겠습니까? >>>
            1 과목의 점수를 입력하세요 >>> 100
            2 과목의 점수를 입력하세요 >>> 90
            3 과목의 점수를 입력하세요 >>> 95
            총합은 285.0이며, 평균은 95.0입니다.
         */
public class Scorecalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int num0fSubs = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>>");
        num0fSubs = scanner.nextInt();
        for (int i = 0 ; i < num0fSubs ; i++) {
            System.out.println((i+1)+ " 과목의 점수를 입력하세요 >>>");
            sum += scanner.nextDouble();
        }
        avg = sum / num0fSubs;
        System.out.println("총합은" + sum + "이고" + "평균은" + avg);


    }



}

