package ch20_collections;

import java.util.*;

/*
    List는 순서가 있고 중복을 허용하는 반면
    Set의 경우 순서는 없고 중복은 허용하지 않기 때문에
    List -> Set / 혹은 Set -> List 로의 형변환이 중요함.
    예를 들어 List로 전체 설문을 받고, Set을 통해 중복을 제거하여
    후보군만 남기는 등의 형태로 많이 사용됨.
    또한 Set 으로 중복을 제거한 후에 다시 List로 돌려서 .get(인덱스넘버)로
    조회도 할 수 있음 , Set은 순서가 없음

    그래서 Set은 우리가 중학생 때 배우는 집합 개념과 유사함
    다만 집합은 숫자로만 이루어졌던 반면에 Set은 다양한 자료형으로 만들어 질 수 있음

 */
public class StrSet {
    public static void main(String[] args) {
        // Set 객체 생성
        Set<String> strSet = new HashSet<>();
        // List 객체도 생성
        List<String> strList = new ArrayList<>();

        // List / Set에 element 추가하는 방법은 동일함 리스트 or List or Set .add(element)
        strList.add("java");
        strList.add("java");
        strList.add("java");
        strList.add("python");
        strList.add("python");
        strList.add("React");
        strList.add("React");
        strList.add("React");
        System.out.println(strList);
        // Set에 추가 하나만 예시
        strSet.add("TypeScript");
        // Set 출력
        System.out.println(strSet);

        // List의 element 들을 전부 Set에 대입 -> 리스트명.addAll(세트명);
        strSet.addAll(strList);
        System.out.println();
        System.out.println(strList); // 원래 List는 유지
        System.out.println(strSet); // Set에 List element 값이 더해짐
        // 하지만 중복이 제거되어서 결과값은 중복이 없는 형태
        for ( int i = 0; i < strSet.size() ; i++) {
            System.out.print(strSet.size()+ " ");
        }
        // 뒤에 "언어"라고 붙여서 java 언어, 와 같이 데이터를 조작하는 것이
        // 불가능하다는 것을 알 수 있음
        // 이상의 문제 등을 이유로 set -> List로의 변환 역시 자주 사용됨
        System.out.println();
        List<String> modfieldStrList = new ArrayList<>();
        modfieldStrList.addAll(strSet); // 중복 제거된 set의 요소들
        // 새로운 List에 대입하는 과정;
        System.out.println(modfieldStrList);
        // set의 순서와 동일하게 들어갔기 때문에 마찬가지로 순서가 보장되지 않음
        Collections.sort(modfieldStrList);
        System.out.println(modfieldStrList); // 대문자 별로 먼저 정렬됨

        // 그럼 List 니까 요소를 추출해서 뒤에 "언어"라고 붙일 수 있음
        /*
             실행 예
            React 언어
           TypeScript 언어
           Java 언어
           Python 언어

           일반 for문으로 / 향상된 for문으로

         */
        for (int i = 0 ; i < modfieldStrList.size(); i++) {
            System.out.println(modfieldStrList.get(i) + " 언어");
        }
        System.out.println();
        for(String modd : modfieldStrList) {
            System.out.println(modd + " 언어 향상된 for문");
        }

    }
}
