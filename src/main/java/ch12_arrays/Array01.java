package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        //배열 선언 및 초기화
        int[] arr01 = {1 ,2, 3, 4, 5};
        int i = 1;
        System.out.println(i);  // 결과값 " 1
        System.out.println(arr01); // 결과값 [I@36baf30c

        // 현재 상황에서 배열 내부의 값을 확인할 수가 없음. 주소지만 출력이 됨
        // 배열 내부의 각 숫자들의 명칭을 ? -> '원소'
        // 현재 배열 내부에는 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이 불가능합니다.
        // 즉 element들을 확인하기 위해서는 배열 내부로 직접 탐색하는 과정이 필요함
        // 이때 필요한 개념이 index(주소지라고 하기도 함)개념이 필요함
        System.out.println(arr01); // 주소값만 출력
        System.out.println(arr01[0]); // 배열명 [index]의 형태로 내부 데이터를 직접 확인 가능


        // 어, index만 뺴고 나머지가 반복되는 것을 확인 됨  -> 반복문 응용

       for (i = 0; i < 5; i++) {
           System.out.print(arr01[i] + " ");
       }
        System.out.println();


       for (i = 0 ; i < arr01.length ; i++) {      //arr01.length 형태로 배열 내부의 데이터 개수가 바뀌더라도 문제가 없음
           System.out.print(arr01[i] + " / ");

       }
        System.out.println();

       // 필드를 참조할 때 객체명,필드 형태로 참조했었지만
        // bank1.accountHolder와 같은 방식으로 참조가 가능했음
        // 그리고 field를 직접 참조했다는 말을 length 필드는 public 이라고 볼 수 있음

        // 그렇다면 배열은 객체인가?               -> 완전히 그렇다고는 x / 하지만 field로 length를 가진다.
        // 빈 배열 생성
        int[] arr02 = new  int[10];  // 10개 짜리 방을 가진 비어있는 배열을 생성

        // 이상의 모든 것을 종합했을 때 ,
        // 배열 내부의 방의 개수 / 주소지의 한계값 -1을 우리가 항상 알고 있는 것은 아니기 때문에
        // element 값을 출력하기 위한 반복문의 한계값을 설정할 때
        // 배열명.length를 쓰는 것을 생활화하자.


        // arr01 내부에 있는 1, 2, 3, 4, 5는 굳이 다지자면 arr[1] ,  ... arr01[4]라는 변수명을 지니고
        // 있다고 볼 수 있다.

        // 변수의 개념을 우리는 다시 생각 해야 함
        arr01[0] = 10;    // 그럼 얘는 재대입
        System.out.println(arr01[0]); // 결과값 : 10

        // 배열에 값을 대입 할 수 있음
        // arr02는 현재 10개짜리 방을 지닌 배열이고 , 내부에는 아무런 값이 없음



        for ( i = 0 ; i < arr02.length; i++){
            arr02[i] =  21 + i;
            System.out.print(arr02[i] + " / ");
            // 값을 대입하는 반복문
        }
        System.out.println();


        //arr02에 21, 22, 23, 24, 25, ,,,30을 대입하고
        // 21 / 22 / 23 / 24 / ,,, / 30이라고 출력될 수 있도록 코드를 작성.


        // arr02에 현재 21, 22, 23 ... 30이 대입 되어 있음
        //42, 44 , 46 ... 60이 될 수 있도록 반복문을 작성하고
        //42, 44 , 46 ... 60으로 출력하시오.

        for (i = 0 ; i < arr02.length; i++){
            arr02[i] *= 2;

            System.out.print(arr02[i] + " / ");
        }
        System.out.println();
        // 다른 자료형도 동일한 방식으로 생성됨
        String[] strArrary01= { "안","안","안","안","안","안", };
        System.out.println(strArrary01[0]);
        //그래서 다른 자료형 배열이라도 기본적으로 element를 추출하는 절차는 동일하다.







    }
}
