package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
     private String username;
     private  String password;
     private  String email;
     private  String name;
     private  int age;
}
public class JSON2 {
    public static void main(String[] args) {
        // 사용할 객체 사용
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        // 하나는 한 줄로 출력하고
        // 하나는 prettyPrinting 적용시켜서 출력 상의 차이를 확인 해보기 위해 두개를 만듦

        // 1. Java Object -> json으로 변환
        /*
            user1 객체를 생성하고, kim1 / 9876 / a@test.com / 김일 / 20 의 필드값을 가지도록 하시오.
            그리고 JSON.java 파일을 참조해서 Json 데이터로 바꾸시오
         */
        /*
            2. Map -> Json으로 변환
            ProductMap1을 생성하고, "productCode", "MYWY3KH/A"
            "productName", "아이폰 16 프로 맥스"
            로 만드시오.


        Map - key - value entry를 가지고 있으니 대응이 가능함
        */


        User user1 = new User("kim1","9876","a@test.com","김일",20);
        String jsonUser1 = gson.toJson(user1);
        System.out.println(jsonUser1);
        String Json1 = gsonBuilder.toJson(user1);
        System.out.println(Json1);
//
//        System.out.println("----");
//        String jsonUser2 = gsonBuilder.toJson(user1);
//        System.out.println(jsonUser2);
//
//        Map<String ,String > ProductMap1 = new HashMap<>();
//        ProductMap1.put("ProductCode" ," MYWY3KH/A");
//        ProductMap1.put("ProductName" ," 아이폰 16 프로 맥스");
//        //Map -> json 데이터로 변환
//        String jsonProduct1 = gson.toJson(ProductMap1);
//        String jsonProduct2 = gsonBuilder.toJson(ProductMap1);
//        System.out.println(jsonProduct1);
//        System.out.println(jsonProduct2);
//        /*
//            이상의 두 사례에서 toJson()이라는 메서드는 argument로 Java Object 자체를 집어넣는 것도 가능하고,
//            Map 으로 생성된 entry를 Json  형태로 바꾸는 것도 가능하다는 것을 확인할 수 있음.
//            즉, toJson()은 overloading이 이루어졌다고 볼 수 있음
//
//            그리고 Gson 객체에서도 toJson()이 있고 gsonBuilder 에서도 toJson()이 있다는 점 또한 중요한 부분
//
//            다음은 json -> Map / Java Object로 바꾸는 방식도 있음.
//            String data인 json을 ""포함해서 쓰는게 너무 번거롭기 때문에
//            user1과 productMap1을 json 으로 바꾼 데이터를 그대로 사용하도록 함
//
//            jsonUser2를 user2로 바꾸고,
//            jsonProduct2를 productMap2로 바꾸기
//
//            형식 :
//            gson.fromJson(제이슨데이터, 바꾸고자하는_클래스명.class);
//         */
//        User user2 = gson.fromJson(jsonUser2,User.class);
//        System.out.println(user2);
//        System.out.println();
//        Map<String,String> productMap2 = gson.fromJson(jsonProduct2, Map.class);
//        System.out.println(productMap2);
//        System.out.println();
//        /*
//            특정 Java 객체와 Json  String data가 있다고 가정했을 때 서로 왔다갔다 하면서 고칠 수 있음
//            Map과 Json 데이터 역시 같음
//         */
//        Map<String ,String> userMap1 = gson.fromJson(jsonUser2, Map.class);
//        System.out.println(userMap1);
//            /*
//                이상의 코드처럼 Java 객체로 만든 것을 -> Json 데이터로 바꾼 다음에 -> 그걸 Map 형태로도 바꿀 수 있음
//              하지만 Map의 경우 Json으로 바꾸는 것까지는 자유인데 걔를 Java 객체로 만들고자 한다면
//              클래스가 정의되어야 함
//              객체는 클래스라는 설계도를 기준으로 만들어진 것이기 때문
//
//              json -> jsonObject로 바꿈
//              그 말은 json =/= jsonObject라는 뜻이 됨
//
//              생각해보면 jsonUser1을 선얼할 때 자료형을 String으로 잡았음
//              근데 jsonObject의 자료형은 무엇인지
//
//             */
//        System.out.println();
//        JsonObject jsonObject1 = gson.fromJson(jsonUser1,JsonObject.class);
//        System.out.println(jsonObject1);
//        JsonObject jsonObject2 = gsonBuilder.fromJson(jsonObject1,JsonObject.class);
//        /*
//            gsonBuilder로 fromJson()을 적용하더라도 콘솔 상에서
//            PrettyPrinting이 적용이 안됨
//
//            그 이유는 fromJson()이라는 메서드명에서 알 수 있듯이
//             JsonData(즉 String Data)를 Map으로 바꾸는 것
//             String의 경우 개행을 통해서 prettyPrinting이 적용 될 수 있지만
//             Map은 toString() 메서드를 재저으이 하지 않으면 default 값 형태로 콘솔에 출력됨
//             그래서 gson.fromJson()이든 gsonBuilder.fromJson()이든 콘솔에 찍히는
//             결과값은 동일함.
//         */
//        System.out.println(jsonObject2);





    }

}
