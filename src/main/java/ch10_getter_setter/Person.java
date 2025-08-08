package ch10_getter_setter;
/*

 */
public class Person {
    String name;
    int age;

    //기본 생성자 , 매게변수가 하나인 생성자 두 개
    // 매개변수가 두 개인 생성자 하나를 총 네개를 정의하시오.
    //parson / 김일 / -10 -> 기본 생성자로 생성
    //parson / 김이 / 201 이름 매개변수 생성자로 생성
    //parson / 김삼 / 20 -> 나이 매개변수 생성자로 생성
    //parson / 김사 / 54 -> AllArgsConstructor 생성자로 생성

    public Person() {



    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter 정의
    /*
        setName 메서드에 비지니스 로직을 추가
        1. argument로 들어온 String 데이터의 글자수를 파악하여
        2. 4 글자 초과라면 "변경할 수 없습니다." 를 출력한 후 메서드를 종료할 것
        3. 4 글자 이하라면 " 이름이 번경되었습니다."
        4.          " 변경 전 : 디카프리오"
        5.          "변경 후 : 이일"
        6. 이 되도록 작성하고, PersonMain에서 person1의 이름을 변경하시오.
        7. main에서의 코드라인
        8. person1.setName("노마드코더");
        9. person1.setName("이일");
        10. 이상의 코드라인을 붙여넣었을 때의 실행 예
        변경할 수 없습니다.
        변경 전 : 디카프리오
        변경 후 : 이일
     */
    public void setName(String title) {
        if(title.length() > 4) {
            System.out.println(" 변경할 수 없습니다.");
            return;
//        } else {
//            System.out.println("변경 전 이름 : " + name);
//            this.name = title;
//            System.out.println("변경 후 이름 : " + this.name);
        }
        //else를 사용하지 않은 방법

        System.out.println("변경 전 이름 : " + name);
        this.name = title;// 자동 생성하면 메게변수명과 필드명이 돌일해서 일부로 다르게 사용함.
        System.out.println("변경 후 이름 : " + this.name);





    }
    public void setAge(int birth) {
        if(birth < 0 || birth > 200) {
            System.out.println("불가능한 나이 입력입니다.");
            return; // method에서 return 은 즉시 종료 키워드
            // 즉 이 이하로는 아예 실행이 되지 않음
        }
        System.out.println("변경전 나이" + age);
        this.age = birth;
        System.out.println(" 변경 후 나이" + age); // 대입 후니까 동일한 코드라도 다른 결과값.
    }


    // Getter 정의
    public String getName() {
        return  name;
    }

    public int getAge() {
        return age;
    }

    //ch10_getter_setter 내부에 univ_student 패키지 생성
    // UnivStudent / UnivStudentMain 클래스 생성





}
