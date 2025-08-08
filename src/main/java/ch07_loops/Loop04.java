package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
     : 대부분의 경우 명확한 횟수가 고정되어 있을 때 사용하는 반복문
     (아까 했떤 과제의 경우 for문을 이용하는 것이 더 편리)

     형식 :
     for(시작값 ; 종료값 ; 증강값)  {
        반복실행문
    }
 */
public class Loop04 {
    public static void main(String[] args) {
        // 1부터 100까지를 출력하는 for문
//        for (int i = 1 ; i < 101 ; i++) {
//            System.out.println(i);
//        }
        // 1부터 100까지의 합을 구하고 한 번만 출력하시오.(for문 사용할 것)
//        int sum = 0;
//
//        for (int i = 0 ; i < 101; i++) {
//            sum += i;
//
//        }
//        System.out.println(sum);
        // 1부터 100까지 중 홀수 합을 구하는 for문을 작성하시오.
        // 1번 그러니까 for문 내부에 if문을 중첩적으로 사용이 가능함
        //2번 그리고 증강값 건드려서 다른 방식으로도 해결이 가능
//        int sum2 =0;
//        for (int i = 1 ; i < 100 ; i++ ) {
//            if( i % 2 ==1) {
//                sum2 += i;
//            }
//        }
//        System.out.println(sum2);
//
//        int sum3 =0;
//        for (int i = 1 ; i < 101 ; i +=2) {
//            sum3 += i;
//        }
//        System.out.println(sum3
//        );

        /*
        숫자를 입력 받아서 1부터 n까지 더하는 반복문을 작성하겠습니다.

        실행 예
        1부터 몇 까지 더하시겠습니까? >>> 10
        1부터 10까지의 합은 55입니다.

         */
        Scanner scanner = new Scanner(System.in);

        int n;
        int sum4 = 0;

        System.out.print("1부터 몇 까지 더하시겠습니까? >>>");
        n = scanner.nextInt();

        for(int i = 1 ; i < (n + 1); i++) {
            sum4 += i;

        }
        System.out.println("1부터 " + n + " 까지의 합은 " + sum4 + " 입니다.");

        int sum = ((n*(n+1))/2);

        System.out.println(sum); // 위에 코드식을 가장 짧게 표현





    }
}
