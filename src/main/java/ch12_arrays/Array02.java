package ch12_arrays;

import java.util.Scanner;

/*
    1. humans 배열에 이름을 입력 할 수 있도록 변경
    실행 예
    몇 명의 학생을 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일

    2 번 학생의 이름을 등록하세요 >>> 김이

    3 번 학생의 이름을 등록하세요 >>> 김삼

    4 번 학생의 이름을 등록하세요 >>> 김사

    5 번 학생의 이름을 등록하세요 >>> 김오


    학생들의 점수 총합은 21.5점 입니다.

    2. scores 배열에 점수를 입력할 수 있도록 변경
    1 번 학생의 점수를 입력하세요 >>> 4.5
    1 번 학생의 점수를 입력하세요 >>> 4.2
    2 번 학생의 점수를 입력하세요 >>> 3.2
    3 번 학생의 점수를 입력하세요 >>> 3.1
    4 번 학생의 점수를 입력하세요 >>> 3.8
    5 번 학생의 점수를 입력하세요 >>> 2.8

    학생들의 점수 총합은 21.5점 입니다.

 */
class Array02 {
    public static void main(String[] args) {
        //우리가 고민해야 할 점
        // 몇 명의 학생을 등록하시겠습니까 ? >>> 5 이라고 가정해보겠습니다.
        // 그럼 그 이후에 5명 짜리를 등록 할 수 잇는 방 배열이 생성되어야 함
        Scanner scanner = new Scanner(System.in);
        int human = 0;
        System.out.print(" 몇 명의 학생을 등록하시겠습니까? >>> ");
        human = scanner.nextInt();
        scanner.nextLine();

        String[] humans = new String[human];
        for (int i = 0; i < humans.length; i++) {
            System.out.print((i + 1) + "번 학생의 이름을 등록하세요 >>> ");
            humans[i] = scanner.nextLine();
        }


        //humans라고 하는 배열의 크기와 scores라는 배열의 크기는 동일애햐 함
        // 빈 배열의 선언 및 크기 지정은 할 때 어떤 변수를 사용 할 수 있는가?
        double sum = 0;
        double[] scores = new double[human];

        // 이건 drrection을 모두 반영한 코드라고 할 수 있고 , 그리고 밑에는 그냥 실행 예만 반영한 형태
        for (int i = 0; i < humans.length; i++) { // human.length나 scores.length나 human이나 다 똑같음
            System.out.print((i + 1) + "번 학생의 점수을 등록하세요 >>> ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }
        System.out.println("학생들 점수의 총합은 " + sum + " 점 입니다.");

//        for (int i = 0; i < human; i++) {
//            sum += scanner.nextDouble();
//        }
        String[] names = { "김일","김이","김삼","김사","김오",};

        for (int i = 1 ; i < names.length; i +=2 ) {
            System.out.println(names[i]);

        }

        //[1],[3]에 해당하는 element만 출력하는 반복문을 작성하십시오.
        for (int i = 0; i < names.length; i++) {
            if ( i % 2 == 1) {
                System.out.println(names[i]);
            }
        }
        for ( int i = 1 ; i < names.length ; i+=2 ) {
            System.out.println(names[i]);
        }
        for ( int i = 0 ; i < names.length ; i++ ) {
            if (i % 2 == 1) {
                System.out.println(names[i]);
            }
        }


    }

}


