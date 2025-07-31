import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("시작 숫자를 입력하세요 >>> ");
        int n1 = scanner.nextInt();
        System.out.print("끝 숫자를 입력하세요 >>> ");
        int n2 = scanner.nextInt();
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
            System.out.println("시작 숫자가 끝 숫자보다 커서 두 숫자를 교환했습니다, 새 범위:");
        }
        int totalSum= 0;
        int sumEven = 0;
        int sumOdd = 0;

        for(int i = n1 ; i <= n2; i++){
            totalSum += i;
            if(i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        System.out.println(n1 +" 부터" + n2 + "까지의 총합은 " + totalSum + " 입니다.");
        System.out.println(n1 +" 부터" + n2 + "까지의 짝수 합은 " + sumEven + " 입니다.");
        System.out.println(n1 +" 부터" + n2 + "까지의 홀수 합은 " + sumOdd + " 입니다.");





    }
}
