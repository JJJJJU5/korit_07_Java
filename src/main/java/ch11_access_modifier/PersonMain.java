package ch11_access_modifier;

class Person {
    private  String name;


/*
      setter / getter 는 default로 access modifier가 public이므로
    클래스 외부에서 사용 가능합니다.

    저희는 현제 객체 생성까지 완료한 상황
    setter /getter를 활용하여
    처음 이름을 "김일"로 입력하고,
    그 이름을 콘솔에 출력
    다시 이름을 "이일"로 수정하고,
    바뀐 이름을 콘솔에 출력하시오.
 */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PersonMain {
    public static void main(String[] args) {
        //객체 생성
        Person person1 = new Person();

//       preson1.name "김일"; 이제는 불가능 합니다.
//        System.out.println(person1.name); 마찬가지로 불가능 ? -> private 때문

        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());

    }
}
