package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //변수 선언
        String name;
        name = "안근수";
        System.out.println(name);
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 >>>");
        name = scanner.nextLine();
        /*
          1. println 과 print의 차이
             ln : Line new -> println으로 실행하면 출력문이 다 나오면 자동으로 개행됨.
             print로 작성 할 경우에 동일 라인에 그대로 연결됨.
          2. nextLine / nextInt /
         */
        System.out.println("연도를 입력하세요.>>>");
        int year = scanner.nextInt();
        System.out.println("이름을 다시 입력하세요 >>> ");
        name = scanner.next();
        System.out.println(name);
        /*
           2. next ( Int / double, ... etc) vs. nextLine
                    -nextLine은 띄어쓰기를 허용합니다. enter 키. 즉 개행을 기준으로 데이터가 변수에 저장됨.
                    그래서 24번 라인 실행 결과가 ahn이었습니다.
                   -나머지는 허용안합니다. 띄어쓰기하면 잘려서 대입됩니다.
         */
        System.out.println("올해는 몇 년도 인가요? >>>");
        int year1 = scanner.nextInt();
        System.out.println("당신의 이름은?>>>");
        String name1 = scanner.nextLine();
        System.out.println("연도 : " + year1);
        System.out.println("이름 : " + name1 );

        /*
          이상의 코드에서의 문제점은 34번 라인이 실행됐을 때 데이터를 입력 받지 않고
          그대로 넘어간다는 점입니다.
          왜 이런 문제가 생기냐면 nextInt()에서 값을 입력하고 저희가 enter를 치게 되는데,
          그 경우 다음 nextLine()에서는 enter키를 받아들여서 빈값인 상태로 enter를 쳤다고
          인지하게 되기 때문에
          곧장 35번 출력문으로 넘어갔기 때문입니다.

          해결방법 : enter 키를 받아주는 nextline()을 하나 더 만들어줍니다.




         System.out.println("올해는 몇 년도 인가요? >>>");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("당신의 이름은?>>>");
        name = scanner.nextLine();
        System.out.print("연도 : " + year);
        System.out.print("이름 : " + name );
        /*
          1. 다음과 같이 콘솔에 출력 될 수 있도록 코드를 작성하시오.
          나이를 입력하세요>>> 19
          저는 올해 19살입니다.
          내년에는 20살이 됩니다.

          2. 다음과 같이 콘솔에 출력될 수 있도록 코드를 작성하시오.
          점수를 입력하세요 >>>4.5
          이름을 입력하세요 >>> 김일
          김일 학생의 점수는 4.5입니다.
         */


        System.out.println("나이를 입력하세요>>>");
         int age = 19;
        System.out.println("저는 올해" + age + "살입니다\n 내년에는 ");

        System.out.println("풀이법 # 1 베리어를 쓰는 방법");

        double score = scanner.nextDouble();
        System.out.println("이름을 입력하세요 >>>");
        name = scanner.nextLine();




    }

}

