package ch10_getter_setter.univ_student;

public class UnivStudentMain {
    public static void main(String[] args) {

        UnivStudent univStudent = new UnivStudent();
        UnivStudent univStudent1 = new UnivStudent();
        UnivStudent univStudent2 = new UnivStudent();
        UnivStudent univStudent3 = new UnivStudent();
        UnivStudent univStudent4 = new UnivStudent();

        univStudent.setName("김일");
        univStudent1.setName("김이");
        univStudent2.setName("김삼");
        univStudent3.setName("김사");
        univStudent4.setName("김오");

        univStudent.setGrade(1);
        univStudent1.setGrade(3);
        univStudent2.setGrade(5);
        univStudent2.setGrade(2);
        univStudent3.setGrade(4);
        univStudent4.setGrade(2);

        univStudent.setScore(3.3);
        univStudent1.setScore(-30);
        univStudent1.setScore(4);
        univStudent2.setScore(2.7);
        univStudent3.setScore(3.8);
        univStudent4.setScore(1);

        univStudent.showInfo();
        univStudent1.showInfo();
        univStudent2.showInfo();
        univStudent3.showInfo();
        univStudent4.showInfo();

    }
}
/*
    ch11_access_modifier / Main
 */
















/*
    1.  클래스 설계
        name / grade(1,2,3) / score(double) 로 필드를 정의 하시오.
    2. 생성자
    1)기본 생성자
    2)이름만 받는 생성자
    3)학년만 받는 생성자
    4)이름과 학년을 받는 생성자
    5)이름, 학년 , 점수를 받는 생성자

    3.Setter / Getter 메서드를 정의하시오. ->/ alt + ins를 사용 할 수 있습니다.
        각각의 필드에 대한 setter /getter를 정의 합니다.
        setter 3개 / getter 3개가
        1) setGrade의 범위 1~ 4학년
        2) setScore의 범위 0.0 ~ 4.5 까지
        범위를 벗어날 경우 불가능한 입력입니다.가 출력되도록 비지니스 로직을 완성

    4.UnivStudentMain에서
    student1 -> 기본생성자 김일 / 1 / 3.3
    student2 -> 기본생성자 김일 / 3 / -30 -> 실패하고 4.0 입력
    student3 -> 기본생성자 김일 / 5 / 실패하고 -> 2  2.7
    student4 -> 기본생성자 김일 / 4 / 3.8
    student5 -> 기본생성자 김일 / 2 / 1.0
 */