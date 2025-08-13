package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        int students = 0;
        String fieldTrip;
        List<String> fieldtrip2 = new ArrayList<>();
        Set<String> fieldtrip3 =new HashSet<>();


        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생의 수학 여행지를 입력하시겠습니까? >>>");
        students = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < students ; i++) {
            System.out.print((i+1) + "학생의 여행지를 입력하세요 >>>");
            fieldTrip = scanner.nextLine();
            fieldtrip2.add(fieldTrip);
        }
        for (int i = 0; i < fieldtrip2.size(); i++ ){
            System.out.println(fieldtrip2.get(i));
        }
        fieldtrip3.addAll(fieldtrip2);
        System.out.println(fieldtrip3);
        List<String>FinalFieldTrips =new ArrayList<>();
        FinalFieldTrips.addAll(fieldtrip3);

        for (int i = 0; i < FinalFieldTrips.size();i++){
        }
        System.out.println("수학여행 후보지는" + FinalFieldTrips + ", 입니다");





    }


}
