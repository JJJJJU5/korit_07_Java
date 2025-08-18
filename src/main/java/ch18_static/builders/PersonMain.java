package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
    // 기존의 객체생성 방식
    // Person person1 = new Person(); // builder 정의 할 때 private로 생성했기 이 방식으로 생성하지 못함

        // 이하 예시는 AllArgConstructor 이다
        Person person1 = new Person.Builder()
                .age(38).address("부산 광역시")
                .name("안근수")
                .build();
        System.out.println(person1);

        Person person2 = new Person.Builder()
                .build();
        System.out.println(person2);

        Person person3 = new Person.Builder()
                .address("ㅇㅇㅇ")
                .build();
        System.out.println(person3);


    }
}
