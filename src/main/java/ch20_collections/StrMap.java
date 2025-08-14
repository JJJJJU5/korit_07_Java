package ch20_collections;

import java.util.*;

public class StrMap  {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>(); // Key에 해당하는 자료형 , Value에 해당하는 자료형 ->
        // 삽입메서드 -> .put(키,값);
        strMap1.put("kor2025001","김1");
        strMap1.put("kor2025002","김2");
        strMap1.put("kor2025003","김3");
        strMap1.put("kor2025004","김4");
        strMap1.put("kor2025005","김5");
        // 입력 순서대로 출력되지 않음.
        System.out.println(strMap1);
        // key 하나당 value는 하나가 default 즉 키가 같다면 value는 가장 최근 걸로 덮어쓰기가 됨
        strMap1.put("kor2025005","KimFive");
        System.out.println(strMap1);
        /*
            List의 경우 순서가 잇기 때문에 기본적으로 index를 통한 조회가 가능함.
            하지만 Map의 경우 위의 출력 결과와 같이 순서를 보장하지 않기 때문에
            .get("키값"); 을 통해 조회가능
         */
        System.out.println(strMap1.get("kor2025001")+ "님");

        //
        Map<String,Double[]> koreanScores1 = new HashMap<>();
        koreanScores1.put("김1", new Double[2]); // 자료구조가 복합하기 때문에 사용하는 경우가 드뭄


        Map<String,Double> koreanScores2 = new HashMap<>();
        koreanScores2.put("김1",89.2);
        koreanScores2.put("김2",39.2);
        koreanScores2.put("김3",59.2);
        koreanScores2.put("김4",69.2);
        koreanScores2.put("김5",99.2);

        // 특정 Key의 value 수정
        // # 1. 아까 말한 것처럼 Key에는 vlaue가 하나 밖에 없기 때문에 최근걸로 덮어쓰기 됩니다. / 김5가 없으면 만들어서 4.5를 대입
        System.out.println(koreanScores2);
        koreanScores2.put("김5",4.5);
        System.out.println(koreanScores2);
        //# 2. replace(); 김5가 없으면 오류가 발생
        koreanScores2.replace("김5",789.2);
        System.out.println(koreanScores2);
        /*
            두 가지 방법이 있는 이유는 .put()의 경우에는
            없는 key라면 key를 새로 생성해서 value를 초기화하지만
            있는 key라면 value에 재대입을 하게 됨

            반면.replace() 는 없는 key라면 value값 갱신이 일어나지 않음 / 있는 key라면 재대입이 일어남
         */

        // 특정 key의 존재 여부 -> containsKey(); -> boolean
        boolean serchKeyFlag1 = strMap1.containsKey("김6");
        System.out.println("김6 학생 존재 여부 : " + serchKeyFlag1);

        // 특정 value의 존재 여부 -> containsValue() -> boolean
        boolean serchValueFlag1 = strMap1.containsValue("김3");
        System.out.println("해당 Value의 존재 여부 : " + serchValueFlag1);
        System.out.println();
        // Map의 엔트리로 부터 Set생성
        Set<Map.Entry<String,String>> entrySet1 = new HashSet<>();
        // 이상의 코드는 Set을 하나 만드는데 , 내부에 Key가 String, Value가 String인 Map이 통째로
        // 들어간다는 것을 의미함.
        Set<Map.Entry<String,String>> entrySet2 = strMap1.entrySet();
        // 이상의 코드는 strMap1이 Key-Value 쌍을 Set로 바꾸는 메서드인 .entrySet()을 호출 결과를
        // entrySet2라는 변수에 담았음을 뜻함.
        System.out.println(strMap1);
        System.out.println(entrySet2);
        System.out.println();
        List<Map.Entry<String,String>> entryList1 = new ArrayList<>();

        entryList1.addAll(entrySet2);
        System.out.println(entryList1); // list로 바뀌었으니 element  추출이 가능함
        // 이상까지의 과정에서 Map -> Set -> List로 바꾸는 과정을 코드로 작성했는데
        // Map -> List 로 바로 가는 게  가능한지 여부를 따질 필요가 있음
        // 검증 ↓
        // List<Map.Entry<String,String>> entryList2 = new ArrayList<>();
        //entryList2.addAll(strMap1); 이상의 과정에서 오류가 발생함으로 Map -> List로 바로 변환은 불가능 하다는 걸 보여줌

        //.sort()도 가능하고 추출도 가능함

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
        /* Value Set 출력
         Set<String> valueSet = strMap1.values(); -> 오류 발생 -> 불가능 -> 불가능한 이유 ↙
         Key는 중복을 허용하지 않음, 동일한 Key는 중복이 불가능하기 때문에 문제가 없지만 Value는 중복이 가능하기 때문에 문제가 발생
        */
        Collection<String> values = strMap1.values();
        System.out.println(values);






    }
}
