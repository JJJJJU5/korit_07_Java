package ch08_methods.method01;

import java.util.Scanner;

public class Scorecalc02 {
    // method 정의 영역
    // call1() 유형으로 작성
    public static void calcSumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int num0fSubs = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>>");
        num0fSubs = scanner.nextInt();
        for (int i = 0; i < num0fSubs; i++) {
            System.out.println((i + 1) + " 과목의 점수를 입력하세요 >>>");
            sum += scanner.nextDouble();
        }
        avg = sum / num0fSubs;
        System.out.println("총합은" + sum + "이고" + "평균은" + avg);
    }
    public static void main(String[] args) {
        //method 호출 영역
        calcSumAndAvg();


    }
}
