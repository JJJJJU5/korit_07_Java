package ch07_loops;

import java.util.Scanner;

/*
    Scanner를 이용한 별찍기

    몇 줄의 별을 생성하시겠습니까? >>> 3
    *
    **
    ***
    로 만들어 질 수 있도록 작성하시오.
    끝나면
    ***
    **
    *
 */
public class Loop07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" 몇 줄의 별을 생성하시겠습니까? >>>");
        int n = scanner.nextInt();

        for (int i = 0 ; i < (n+1) ; i++) {
            for(int j = 0; j < i ; j++)

                System.out.print(" * ");
            System.out.println();
        }
        for (int i = 0 ; i < (n+1) ; i++) {
            for (int j = (n+1) ; i - j < 0 ; j--)
                System.out.print(" * ");
            System.out.println();
        }
        for ( int i = 0 ; i < n ; i++) {
            for ( int j = n ; j - i > 0 ; j--) {
                System.out.print( " * " );
            }
            System.out.println();
        }




    }
}
