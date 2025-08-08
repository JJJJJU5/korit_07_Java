package ch12_arrays;

import java.util.Scanner;

/*
    매서드를 정의해도 되고 main에 바로해도 상관없음
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */
public class Array05 {
    public void element(String [] score){

        for( int i = 0 ; i < score.length-1 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("입력하세요 >>> ");
            score[i]=scanner.nextLine();
        }


    }


    public static void main(String[] args) {
        Array05 array05 = new Array05();
        String[] scores = new String[5];


        array05.element(scores);

        for( int i = 0 ; i < scores.length-1 ; i++) {
            System.out.println(scores[i] + " + ");
        }
        System.out.println(scores);




    }
}
