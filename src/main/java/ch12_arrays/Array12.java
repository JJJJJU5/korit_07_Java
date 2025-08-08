package ch12_arrays;

import ch08_methods.method01.Method01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/*
    배열의 출력
    엄밀히 말하면 배열 전체를을 출력한게 아니라 내부의 element 들을 출력했음
    System.out.println(arr01); 과 같은 출력문을 작성했을 때
    주소값만 나온다는 사실을 확인할 수 있음.

    근데 element의 값을 조정하거나, 더하거나와 같은 추가적인 가공을 하기위 for 반복문을
    사용해왔는데, 굳이 변형이 없고 배열 자체를 확인하고 싶을때 마다
    main에 반복문 작성하는지 method를 정의하든지 하는 일은 번거로운 일이 됨.

    Arrays 클래스를 사용하고,' 정적' 메서드만 .toString(배열명)을 사용하면
    배열 전체를 출력할 수 있습니다.

    여기서 클래스명.메서드명()이라는 점을 주목 할 수 있음
    scanner.nextLine()과는 다름.
    그리고 toString()이라는 메서드도 곧 사용하게 됨

    여기서 중요한 점은 동일한 method 명이라고 하더라도 어떤 클래스에 ㅌ종속되어있는가에 따라
    다른 결과값을 지닐 수 있다는 점

 */
public class Array12 {


    public static void main(String[] args) {
        // 동일한 메서드 명이지만 클래스에 따라  다른 로직일 수 있다는 예시
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        Random sc = new Random(); // 이런식으로 코드를 사용하면 안됨
//
//        int num1 = random.nextInt();
//        System.out.println(num1);
//        System.out.println("숫자를 입력하세요 >>> ");
//        int num2 = scanner.nextInt();
//        System.out.println(num2);

        //int[] 배열에 1,2,3,4,5...10까지 대입

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        // 배열의 전체 출력 예시
        System.out.println(Arrays.toString(numbers));

        Method01.call1();
        System.out.println(Method01.call3());

        Integer[] nums = { 3 , 6, 7 , 1,9 ,2  , 10 , 5, 4, 8 } ;
        System.out.println("정렬 전 배열 : "+ Arrays.toString(nums));

        //오름 차순 정렬
        Arrays.sort(nums);                     // 얘의 결과값이 void 니까 원본 배열의 정렬을 함
        System.out.println("오름 차순 정렬 후 배열 : " + Arrays.toString(nums) );
        // 내림 차순 정렬
        // 마찬가지로 원본 배열을 다 바꿈
        Arrays.sort(nums , Comparator.reverseOrder());
        System.out.println("내림 차순 정렬 후 배열" + Arrays.toString(nums));
        /*
            이상의 경우는 보면 sort() 메서드에 오름차순에서는 argument가 하나엿는데.
            내림 차순은 argument가 두 개가 필요함
            이상의 과정이 overloading이 이루어졌다는 점을 파악 할 수 있으며
            두번쨰 argument로 Comparator.reverseOrder()가 사용되었는데,
            Comparator.reverseOrder()의 결과값 / return 값이 sort()  메서드의
            두 번째 argument로 사용되었다는 점 역시 함수형 프로그래밍의 일종이라고 볼 수 있음
            근데 Comparator.reverseOrder() 메서드를 쓰려면
            기본 자료형(원시 자료형 / primitive type) int[] 배열을 사용할 수 없어서
            char -> String 처럼 int -> integer 라고만 생각해두면 됨.

         */


    }
}
