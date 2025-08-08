package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int n = 0;



        // 1부터 100까지의 숫자를 2차 배열에 순서대로 값을 넣으시오.
        //즉 nums[0][0] = 1, nums [0][1] = 2 nums [1][0] = 60

        for (int i = 0; i < nums.length; i++) {

            for(int j = 0 ; j < nums[i].length; j++) {
                //값을 대입 할 때 주소지를 두 개 다 설정한 다음 데이터를 넣어야 함.

                nums[i][j] = n++;
                System.out.print(n);
                System.out.print(" ");
            }
            System.out.println();

        }
        for ( int [] firstArray : nums) {
            for ( int number : firstArray) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(nums));




    }
}
