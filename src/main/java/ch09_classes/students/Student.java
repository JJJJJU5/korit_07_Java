package ch09_classes.students;

public class Student {
    /*
    Student 클래스의 필드를 입력하시오.
    1)int Student
    2) String Student
    3) double Student

    2. 기본 생성자를 정의하고, 객체를 생성했을 때,
        "기본 생성자로 객체를 생성했습니다." 라고 출력 되도록
        코드를 작성하시오.

    3.int StudentCode를 매개변수로 하는 매개변수 생성자를 정의,
    "int 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록
    코드를 작성하시오.

    4. String name을 매개변수로 하는 매개변수 생성자를 정의,
    "String 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록
    코드를 작성

    5.studentCode , name 을 매개변수로 하는 매개변수 생성자를 정의,
     int , String 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록
    코드를 작성

    6.studentCode, name , score 을 매개변수로 하는 매개변수 생성자를 정의,
    int , String , double 매개변수 생성자로 객체를 생성했습니다."라고 출력되도록
    코드를 작성

    7. StudentMain 클래스에, 해당 객체명과 속성명을 가질 수 있도록 작성하시오.
    1) student1 2025001 / 김일 / 4.5 -> 기본생성자
    2) student1 2025002 / 김이 / 100-> int 매개변수생성자
    3) student1 2025003 / 김삼 / 95 -> String 매개생성자
    4) student1 2025004 / 김사 / 4.0 -> int , String 매개생성자
    5) student1 2025005 / 김오 / 3.2 -> int , String , double 생성자
    8.학생의 정보가 출력 될 수 있도록 하는 showInfo() 메서드를 Call1() 타입으로 정의

    김일 학생의 정보입니다.
    학번 : 2025001
    이름 : 김일
    학점 : 4.5
     */
    int studentcode;
    String name;
    double score;

    Student() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    Student(int studentcode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentcode = studentcode;

    }

    Student(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    Student(double score) {
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다.");
        this.score = score;
    }

    Student(int studentcode, String name) {
        System.out.println("int , String 매개변수 생성자로 객체를 생성했습니다");
        this.studentcode = studentcode;
        this.name = name;
    }

    Student(int studentcode, String name, double score) {
        System.out.println("int , String , double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentcode = studentcode;
        this.name = name;
        this.score = score;
    }

    void showInfo() {

        System.out.println("\n학생의 정보 ");
        System.out.println("\n학번 "+studentcode);
        System.out.println("\n이름 "+name);
        System.out.println("\n학점 "+score);


    }
}