package ch07_loops;
/*
        *
       **
      ***
     ****
    *****
 */
public class Loop08 {
    public static void main(String[] args) {
//        // 개행을 책임지는 for문 내가 푼 문제
//        for (int i = 0 ; i < 6 ; i++) {
//            System.out.println();
//
//            //공백을 책임지는 for문
//            for (int j = 5 ; j > i ; j--) {
//                System.out.print(" ");
//            }
//
//                //별을 책임지는 for문
//                for (int k = 0; k < i ; k++) {
//                    System.out.print("*");
//                }

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 6; i++) {
            //공백이 늘어나야함
            for (int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0 ; k < 5 - i ; k++){
                System.out.print("*");
            }
            System.out.println();


            // ch08_methods -> Method01 -> main을 만들지 않음

        }
    }
}


