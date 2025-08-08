package ch12_arrays;

public class Array08 {
    int sum = 0;

    public int calcsum(int[] intArray) {

        for (int i = 0; i <  intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;

    }
    public double calcAvg(int[] douAraay) {

        return (double) sum / douAraay.length;

    }






    public static void main(String[] args) {

        Array08 array08 = new Array08();
        int[] scores = {100, 96, 55, 24, 49, 60, 20, 77, 89 } ;





        System.out.println("총합 " + array08.calcsum(scores));
        System.out.println("평균 " + array08.calcAvg(scores));

        // 이상의 예시 배열을 argument로 하는 총합을 굴하는 method calcsum
        // 평균을 구하는 calcaAvg method를 정의하는데, call4() 유형으로 만드시오

    }
}
