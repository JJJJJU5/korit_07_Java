package ch12_arrays;
/*

   접근 지정자 public으로 method들을 정의 했기 때문에
   직접 정의한 Array08 클래스의 메서드만
   calcSum() / calcAvg()를 Array09에서도 사용 할 수 있음
   Scanner를 사용했던 원리와 동일
 */

import java.util.Scanner;

public class Array09 {
    public static void main(String[] args) {
        Array08 array08 = new Array08();
        Scanner scanner = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7};
        // 특정 클래스의 인스턴스에 딸려있는 메서드 호출
        int sum = array08.calcsum(nums);
        double avg = array08.calcAvg(nums);
        int randomNum = scanner.nextInt();
    }
}

// Array10enhancedFor
