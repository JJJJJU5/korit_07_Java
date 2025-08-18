package ch22_exception;

class  LoginFailedException extends  Exception {
    // 생성자 ( 클래스 명과 동일 ) - 매개변수 생성자
    public  LoginFailedException(String message) {
        super(message);          // 슈퍼 클래스의 생성자 호출
        System.out.println("에외가 발생했습니다.");
    }
}
public class Exception02 {

    public  static  void  login(String id, String password) throws LoginFailedException{
        String correctId = "admin";
        String correctPassword = "1q2w3e4r";

        // 매개변수와 지역변수의 일치 확인 여부 조건문
        // 메서드 내에 고전적인 예외 처리를 작성한 예시
        if(!id.equals(correctId) || !password.equals((correctPassword))) {
//            System.out.println("로그인 실패!!  ID 혹은 비밀번호를 확인하세요");
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다."); // ID 또는 PW가 틀렸습니다를
            // argument 로 하는 LoginFailedException 객체가 생성되었다고 볼 수 있음

           // login(inputId, inPutPassword); // 코드 작성 순서를 잘 기억해야 함



        }
    }
    public static void main(String[] args) {
        String inputId = "admin";
        String inPutPassword = "1234qwer";
        try {
            login(inputId, inPutPassword);
        } catch ( LoginFailedException e) { // 자동완성으로 사용자 정의 Exception 클래스가 나왔는데
           // 그 근거는 login() 매서드 다음에 throw LoginFailException을 작성했기 때문
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }

    }
}
/*
    사실상 사용자 정의 예외 처리 방식 역시
    try /catch / finally와 throws / throw가 추가되었을 뿐이지
    method의 정의 / 생성자 정의 / 객체 생성 방식 자체는 동일한 걸 알 수있음

 */
