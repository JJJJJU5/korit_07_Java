package ch09_classes.students;

public class Student02 {
    int studentcode;
    String name;
    double score;

    //좌상단 햄버거(메뉴바) -> 코드(Code) -> 생성
    //alt + ins 누르면 바로 됨
    // 자동 완성으로 알아서 생성자 만드시고
    //거기에 sout 문구 전부 다 집어넣으시오.
    // default로 생성 되었을 때는 안내문구를 쓸 수 없음.


    public Student02() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    public Student02(int studentcode) {
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
        this.studentcode = studentcode;
    }


    public Student02(String name) {
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
        this.name = name;
    }

    public Student02(double score) {
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다.");
        this.score = score;
    }

    public Student02(int studentcode, String name) {
        System.out.println("int , String 매개변수 생성자로 객체를 생성했습니다");
        this.studentcode = studentcode;
        this.name = name;
    }

    public Student02(int studentcode, String name, double score) {
        System.out.println("int , String , double 매개변수 생성자로 객체를 생성했습니다.");
        this.studentcode = studentcode;
        this.name = name;
        this.score = score;
    }
}
