package ch08_methods.method01;

import java.util.Scanner;

/*
    메서드 02에 별찍기 관련 메서드를 생성함
    그 형태를 잘 응용하여
    main에서 Scanner 임포트를 받은 몇 줄 짜리를 쓸건지
    옵션을 몇 번 선택할지 물어봐야 하는가?

    그냥 메서드를 실행 시킬 때 알아서 물어보면 간단하게 됨.
 */
public class Method03 {

    public static String getStar() {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        int rows = 0;

        int option = 0;
        System.out.println("몇 쭐 짜리 별을 생성할까요 ? >>>");
        rows = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");
        option = scanner.nextInt();
        if (option == 1) {
            for (int i = 0 ; i < rows + 1 ; i++) {
                for (int j = 0 ;j < i ; j++ ) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 2) {
            for ( int i = 0 ; i < rows ; i++) {
                // 공백 관련 for문
                for( int j = 0 ; j < rows - (i + 1) ; j++ ) {
                    result += "  ";
                }
                // 별찍기 관련 for문
                for ( int k = 0 ; k < i + 1 ; k++ ) {
                    result += "*️";
                }
                result += "\n";
            }
        } else if (option == 3) {
            for ( int i = 0 ; i < rows ; i++ ) {
                for ( int j = rows ; j > i ; j-- ) {
                    result += "*";
                }
                result += "\n";
            }
        } else if (option == 4) {
            for (int i = 0 ; i < rows ; i++) {
                for (int j = 0 ; j < i + 1 ; j++) {
                    result+= " ";
                }
                for (int k = rows ; k > i ; k--) {
                    result += "*";
                }
                result += "\n";
            }
        } else {
            result = "해당 기능은 없습니다.";
        }
        return result;
    }

    public static void main(String[] args) {
//        String starResult = "";
//        starResult = getStar();
//        System.out.println(starResult);

        System.out.println(getStar());


    }
}
