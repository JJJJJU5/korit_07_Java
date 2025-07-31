package ch07_loops;
/*
    while 반복문
    형식 :
    while(조건식) {
        반복실행문
    }
    while 뒤에 나오는 (조건식)을 봤을 때 if(조건식) 형태와 유사합니다.
    즉, while() 내의 조건식이 true 일 때 , {} 내의 실행문이
    '반복적으로' 이루어 집니다.
    그래서 주의할 점이 있는데
    while 내부의 조건식이 특정 시점에 false가 되도록
    미리 설계를 해둘 필요가 있습니다.

    false가 되는 시점을 지정해주지 않는다면 계속 true 상태가 유지 되어

    반복 실행문이 무한이 계속 되기 떄문에
    무한 루프 라는 표현을 사용.
 */
public class Loop01 {
    public static void main(String[] args) {
        // 1부터 100까지 출력하는 예시
        int i = 0;
        while (i < 101) {
            System.out.println(i);
             ++i;                                  //i를 증가시켜서 24번 라인이
             //특정 시점에 조건이 false가
            //되도록 지정
        }
        System.out.println("최종 i의 결과값");
//       int j = 0;
//           while (j < 100) {
//                System.out.println(++j);

            // 그래서 1부터 100까지의 합을 구하는 방식
//        int num1 = 1;
//        int sum = 0;
//        //을 이용하여 1부터 100까지의 합을 구하시오.
//        // for문을 쓰지 않고 작성
//
//        sum = (100 * 101) / 2;
//       System.out.println(sum);
//        while (num1 < 101){
//            sum += num1;
//            num1++;
//
//        }
//        System.out.println("최종 합계 : " + sum);
//       int sum2 = (100 * 101) / 2;
//        System.out.println("등차수열의 합계 공식 이용 : " + sum);


        /*
            사실 1부터 1씩 증가하는 합 공식은 while 반복문을 쓰는 것 자체가
            비효율 적이다

            하지만 while문 자체는 Java 문법이고 , if에서와 동일하게 중첩적으로 사용이 가능하다
            그리고 while문 내부에 if문이 들어가는 응용이 가능함

            예를 들어, '공차가 2인 a1이 0인 수열의 a50까지의 합을 구하시오'
            와 같은 문제가 나온다고 가정했을 때, 그 때는 47번 라인의 공식 적용이
            불가능하하다
         */
//        int j = 0;
//        int sum2 = 0;
//        while (j <  100) {
//         if( j % 2 == 0) {
//                sum2 += j;
//            }
//
//      }
//        while (j <  101) {
//            sum2 += j;
//            j+=2;
//        }
//        System.out.println(sum2);
        /*
            1부터 100까지
            1
            2
            3
            ...
            100
            으로 출력하는 것을 위에 예시가 나와있습니다.
            1 2 3 4 5 6 ... 100으로 출력하시오.
         */
            int k = 0;
            while (k < 100) {
                System.out.print(++k + " ");

            }


    }

}










