package ch08_methods.method01;
/*
    별찍기 관련한 부분을 메서드화 시키기
 */


import java.util.Scanner;

public class method02 {

    // call4() 유형으로 작성 . -> 몇 줄 짜리인지 / 어 떤 유형인지를 main에서
    // 받을 예정이기 때문
    public static String getStar(int rows, int option){
        String result = "";
        //이 사이에 별찍기 관련 로직이 들어갈 예정.


        return  result;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row0fstars = 0;
        int choice = 0;
        String starResult = "";

        System.out.println("몇 쭐 짜리 별을 생성할까요 ? >>>");
        row0fstars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 감소하는 별");
        System.out.println("4. 오른쪽으로 치우친 감소하는 별");
        System.out.print("선택하세요 >>> ");
        choice = scanner.nextInt();

        starResult = getStar(row0fstars, choice);

        System.out.println(starResult);

        /*
            나머지는 내일 작성하게 될건데 , 이제주요하게 봐야되는 개념이 뭐냐면
            영어();
            라고 되어있는 부분에서 괄호 있는 영단어/문장이 사실은 메서드였다는 점
            scanner.nextLine();
            System.out.println("특정내용");
            과 같은 식으로 저희 여태까지 영어로 명령어를 쓰고 소괄호를 적용한 모든 것들이
            메서드와 관련된 부분이었고, 그래서 사실 잘 쓰고 있었던 것이기 때문에
            낯설게 느끼기 보다는 원리를 이해하는 과정

         */

    }
}
