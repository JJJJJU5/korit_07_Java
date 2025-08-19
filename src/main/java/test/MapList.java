package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
    public static void main(String[] args) {
        List <Map<String, Object>> customers = new ArrayList <>();
        Map <String, Object> Mapcustomer1 = new HashMap <>();
        Mapcustomer1.put("name", "홍길동");
        Mapcustomer1.put("rating", "vip");
        Mapcustomer1.put("age", 30);
        Map <String, Object> Mapcustomer2 = new HashMap <>();
        Mapcustomer2.put("name", "김기영");
        Mapcustomer2.put("rating", "gold");
        Mapcustomer2.put("age", 35);
        customers.add(Mapcustomer1);
        customers.add(Mapcustomer2);
        for (Map <String,Object> customer : customers) {
            for (Map.Entry <String,Object> customer2 : customer.entrySet()) {
                System.out.println(customer2);
            }
            System.out.println();
        }
    }
}