package ch20_collections;

import java.util.*;
/*
    1. 학생의 수를 입력 받아 해당 횟수만큼 반복문을 실행할 것
    2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
    3. 중복을 제거하기 위하여 fieldTripSet에 이상의 List의 element들을 옮겨 담을 것
    4. 맨 마지막 출력문은 Set > List로 재이동하여 FinalFieldTrips List에서 element들을 추출하여 작설 할 것.

     실행 예
     몇 명의 학생이 수학 여행지를 입력하시겠습니까? >>> 5명
     1 번  학생의 수학 여행지를 입력하세요 >>> 제주
     2 번  학생의 수학 여행지를 입력하세요 >>> 제주
     3 번  학생의 수학 여행지를 입력하세요 >>> 민속촉
     4 번  학생의 수학 여행지를 입력하세요 >>> 민속촌
     5 번  학생의 수학 여행지를 입력하세요 >>> 제주

     1번 학생의 후보지 : 제주
     2번 학생의 후보지 : 제주
     3번 학생의 후보지 : 민속촌
     4번 학생의 후보지 : 민속촌
     5번 학생의 후보지 : 제주

     수학 여행 후보지는
     제주
     민속촌
     입니다.
     */

public class FieldTrip {
    public static void main(String[] args) {
        int students = 0;
        List<String> fieldtripList = new ArrayList<>();
        Set<String> fieldtripSet =new HashSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생의 수학 여행지를 입력하시겠습니까? >>>");
        students = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < students ; i++) {
            System.out.print((i+1) + "학생의 여행지를 입력하세요 >>>");
            String fieldtrip  = scanner.nextLine();
            fieldtripList.add(fieldtrip);
        }
        for (int i = 0 ; i < students ; i++) {
            System.out.println((i+1) + " 번 학생의 후보지 " + fieldtripList.get(i));
        }

        for (int i = 0; i < fieldtripList.size(); i++ ){
            System.out.println(fieldtripList.get(i));
        }
        fieldtripSet.addAll(fieldtripList);
        System.out.println(fieldtripSet);
        List<String>FinalFieldTrips =new ArrayList<>();
        FinalFieldTrips.addAll(fieldtripSet);

        for (int i = 0; i < FinalFieldTrips.size();i++){
        }
        System.out.println("수학여행 후보지는" + FinalFieldTrips + "입니다");





    }


}
