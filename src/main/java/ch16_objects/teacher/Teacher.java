package ch16_objects.teacher;

import java.util.Objects;

public class Teacher {
    private String name;
    private String school;

    //AllArgsConstructor 정의
    // Getter / Setter 정의
    //toString 정의
    // ㅇㅇ 선생님의 근무지는 ㅇㅇ학교 입니다.
    //라고 출력 되게 override

    //TeacherMain에서
    // teacher1에서 안근수,코리아 아이티 객체 생성
    // teacher2에서 안근수,코리아 아이티 객체 생성


    public Teacher(String school, String name) {
        this.school = school;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return name + "선생님의 \n근무지는 " + school + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(school, teacher.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, school);
    }
}
