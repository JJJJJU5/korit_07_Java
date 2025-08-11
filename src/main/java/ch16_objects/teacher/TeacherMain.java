package ch16_objects.teacher;



import java.lang.reflect.Field;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("코리아아이티" , "안근수");
        Teacher teacher2 = new Teacher("코리아아이티" , "안근수");


        boolean result1 = teacher1.equals(teacher2);
        System.out.println(result1);        //true
        //이상의 코드에서 중요한 점은 재정의 전과 후과 결과값이 다르다는것
        // Teacher에서 .equals()를 재정으하기 전에는 false 결과값이 나옴
        // 그때의 경우는 teacher1과 teacher2의 주소지까지 확인하여
        // 같은지 아닌지의 여부를 판단했다면
        // 재정의 이후에는 field에 입력된 데이터가 동일한지만을 체크하기 때문

        Class tClass = teacher1.getClass();
        System.out.println(tClass); // 결과값 class ch16_objects.teacher.Teacher
        System.out.println(tClass.getSimpleName());
        System.out.println(teacher1.getClass().getSimpleName());


        Field[] fields = tClass.getDeclaredFields();
//        System.out.println(fields);  주소지 출력됨 []시작 되면 배열
        for (int i = 0 ; i < fields.length ; i ++) {
            System.out.println("필드명 출력: " +  fields[i].getName());
            System.out.println("패키지명 + 클래스명 출력: " + fields[i].getType());
            System.out.println("클래스명 출력: " + fields[i].getType().getSimpleName());

        }

        // 동일한 방식으로 향상된 for문으로 작성
        for ( Field field : fields) {
            System.out.println("필드명 출력: " +  field.getName());
            System.out.println("패키지명 + 클래스명 출력: " + field.getType());
            System.out.println("클래스명 출력: " + field.getType().getSimpleName());
        }

        // 새로운 객체 만들건데 주의
        ch16_objects.Teacher teacher3 = new ch16_objects.Teacher("코리아아이티","안근수");
        boolean result2 = teacher1.equals(teacher3);
        System.out.println(result2);         //false

       // System.out.println(teacher3 instanceof Teacher);     //오류발생
        // teacher3의 자료형은 ch16_objects.Teacher이지
        //ch16_objects.teacher.Teacher가 아니여서

    }
}
