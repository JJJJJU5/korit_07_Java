package ch09_classes.students;

public class StuMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentcode = 2525001;
        student.name ="오정욱";
        student.score = 4.5;

        Student student1= new Student(2025002);
        student1.studentcode = 2025002;
        student1.name = "김이";
        student1.score = 100;

        Student student2 = new Student("김삼");
        student2.studentcode = 2025003;
        student2.name = "김삼";
        student2.score = 25.2;

        Student student3 = new Student(1,"김사");
        student3.studentcode = 2025004;
        student3.name = "김사";
        student3.score = 10;
        Student student4 = new Student(1,"김오",1);
        student4.studentcode = 2025005;
        student4.name = "김오";
        student4.score = 10.5;

        student.showInfo();
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();


    }



}
