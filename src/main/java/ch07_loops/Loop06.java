package ch07_loops;
    /*
    Nested for - loop ( 중첩 포문 )
    for(시작값 ; 한계값 ; 증강값) {
        반복실행문 1 - a
        for(시작값 ; 한계 값 ; 증강값) {
            반복실행문2
        }
        반복실행문1-b
        for(시작값 ; 한계값 ; 증강값) {
            반복실행문3
        }
        반복실행문1-c
    }
    *
    **
    ***
    ****
    *****
    고려 사항
    반복은 몇 번 이루어지는가?
    무엇을 기준으로 반복이 이루어졌다고 판단 할 수 있나?
    왜 라인 마다 별의 갯수가 달라지는가?
     */
public class Loop06 {
    public static void main(String[] args) {

        for( int i = 0 ; i < 6 ; i++) {
            for ( int j = 0 ; j  <  i ;  j++) {

                System.out.print(" * ");
            }
            System.out.println();

            /*
                별 찍기를 통한 for문 구조 학습
                        i = 0 , j= 0 일 때는 두 번째 for 문이 작동 안하기 때문에 개행만 이루어짐 ,
                        i = 1일때, j = 0일 때 별 하나 찍히고, i = 1 / j = 1일 때 false 다음 반복으로 넘어감
                        i = 2 , j = 0 , 1 일 때 별이 두개
                        i = 3
                        i = 4
                        i = 5 , j = 0 , 1 , 2 , 3 , 4 까지  다섯개의 별이 찍히고 종료
                        종료되고 나서 개행이 이루어 짐


                *
                **
                ***
                ****
                *****


                *****
                ****
                ***
                **
                *
             */
        }
        // 1.
        for ( int i = 0 ; i < 6 ; i++) {
            for (int j = 5 ; j - i > 0 ;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        // 2. i가 5부터 시작해서 좁히는 방법
        // for ( int i = 5 ; i > - ; 1--) {
            // for int j = 0 ; j < i ; j++) {
                // sout("*");
        //}
        //sout()



        //번외 문제 -> 100부터 1까지 엯순으로 출력하시오.
        for ( int i = 100; i > 0 ; i--) {
            System.out.print(i+" ");
            if (i % 10 == 0 ) {
                System.out.println(" ");
            }

        }

    }
}
