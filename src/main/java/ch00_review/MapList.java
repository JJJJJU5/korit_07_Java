package ch00_review;

import javax.management.ObjectName;
import java.util.*;

public class MapList {
    public static void main(String[] args) {
       // 처음 Generic이 도입됐을 때는 선언했을 때, 생성자 호출했을 때 둘 다 자료형을
        // 명시했어야 하니 업데이트 되면서 선언하는 부분에만 적어주면 됨.
        List<Map<String,Object>> customers = new ArrayList<>();
        /*
            이상의 코드에서 Key는 String이고 Value는 Object로 되어있는 것을 확인할 수 있음.

            실행 예
            name=홍길동
            rating=vip
            age=30
            name=김가영
            rating=Gold
            age=35

         */
        Map<String,Object> customer1 = new HashMap<>();
        Map<String,Object> customer2 = new HashMap<>();
        customer1.put("name","홍길동");
        customer1.put("rating","VIP");
        customer1.put("age",30);
        customer2.put("name","김기영");
        customer2.put("rating","Gold");
        customer2.put("age",35);

        customers.add(customer1);
        customers.add(customer2);


        for(Map<String,Object> customer : customers ) {
         for (Map.Entry<String,Object> entry : customer.entrySet()){
                System.out.println(entry);

            }
         }

    }


}

