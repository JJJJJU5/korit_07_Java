package ch07_loops;
/*
    중첩 while문 ( Nested - while)
    while(조건식1) {
        반복실행문 1-a
        while(조건식2){
             반복실행문2
         }
         반복실행문1-b
     }중첩 while문 ( Nested - while)
    while(조건식1) {
        반복실행문 1-a
        while(조건식2){
             반복실행문2
         }
         반복실행문1-b
     }
 */
public class Loop03 {
    public static void main(String[] args) {
        int day = 1;
        //1일차 1교시입니다. 1일차 3교시입니다.
        //2일차 1교시입니다. ...
        //5일차 1교시입니다. ~ 5일차 3교시입니다.
//        while (day < 6) {
//            int lesson = 1; // 반복실행문 1 - a에 해당합니다. 변수 선언 및 초기화 반복문 내부에서 이루어짐
//            while (lesson < 4) {
//                System.out.println(day + " 일차 " + lesson + "교시입니다." );
//                lesson++;
//            }
//            day++; // 반복실행문 1-b에 해당함.
//        }
       // System.out.println(lesson);  반복문 밖에서 lesson을 꺼내서 쓸 수 없음 day - 전역 lesson - 지역
        // 차이는 {} 내부에 있냐 밖에 있냐

        /* 이상의 코드를 활용하여
        2 x 1 = 2
        2 x 2 = 4
        ...
        9 x 9 = 81을 출력하시오
         */
       int dan = 2;
        while(dan < 10) {
            int oo = 1;
            while (oo < 10) {
                System.out.println(dan + " x " + oo + " = " +(dan*oo));
                oo++;
            }
            dan++;
        }




    }
}
