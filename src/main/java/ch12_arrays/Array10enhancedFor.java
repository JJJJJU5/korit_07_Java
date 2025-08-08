package ch12_arrays;
/*
    향상된 for문(Enhanced For Loop)

    일반 for 문과의 차이점 :
    일반 for 문의 경우 index 넘버(주소지)를 명확하게 알고 있어야 하지만
    일일이 element의 숫자를 세는 것이 번거롭기 떄문에
    arr01.length와 같은 방식으로 일종의 field 창조물 통해 int 값을 추출하여
    대입해야만 했음

    그런데 잘 생각해보면 for (int i - 0 ; ... ) 부분에서 int i는
    for문 내부에서 선언되고 , 내부에서만 사용이 가능함.

    이를 응용하여 배열 내의 element에 for문 내부에서만 사용하는 변수에 대입하는
    방식으로 index 넘버(주소지)의 사용없이 적용할 수 있는 for 반복문이 있는데.
    이를 향상된 for 문이라고 함.

    제약 :
    읽기만 되고 , 쓰기가 안됨. ( 1부터 100까지 추출하는건 되는데 집어 넣는건 제한됨 )

    형식 :
    for(자료형 변수명 : 반복가능객체(배열)) {
        반복실행문
    }
 */
public class Array10enhancedFor {

    public static void main(String[] args) {
        int[]nums = new int[200];
        //1부터 200까지 대입하시오.
        //일반 for문 형태로 1
        for(int i = 0; i < nums.length ; i++){
            nums[i] = (i+1);
            System.out.println( nums[i] + " ");
        }
        System.out.println();
        // 향상된 for문으로 출력
        for(int number : nums) { // int []
            System.out.println(number + " ");
            // 첫 번째 반복에서 nums의 첫 번째 element인 1을 number에 대입
            // 즉 number = 1; 이 된 상황 -> 어디서? 38번  라인에서
            //대입이 된 상태로 39번 라인을 실행시킵니다. "1" 까지 출력됩니다.
            // 그 다음 반복으로 넘어가서 nums의 두 번쟤 element인 2를 number에 대입
            //39번 실행
            //다음 3대입
            //39 실행
            //...200대입
            //39라인 실행하고, 마무리 (마무리 시점은 마지막 element 대입후
            // 반복실행문 실행 후)
            // 이후 반복문 바깥에서는 int i와 동일하게
            //number 변수를 사용 할 수 없음.

        }
        // number = 201; 불가능하다.

        String[] name = { "김일","김이","김삼","김사","김오", };

        for(int i = 0; i < name.length ; i++){
            System.out.println(name[i]);
        }
        System.out.println();
            for(String names : name) {
            System.out.println(names + " ");
        }

    }
}
/*
    개발자들이 자기가 일일이 코드 치는 경우도 많겠지만 남의 거 보고 수정하거나 유지보수하는 일이 많습니다.
    Java를 기준을 봤을 때

 */
