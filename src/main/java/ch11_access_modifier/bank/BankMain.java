package ch11_access_modifier.bank;


public class BankMain {
    public static void main(String[] args) {
        //객체 생성 및 실패
        //특정 방식을 이용하면 비밀번호 범위나 잔액 범위를 벗어난 상태로
        //객체 생성이 가능하다는 점
        Bank myBank = new Bank(12345, " 홍길동", 100000, 1234);
        Bank myBank2 = new Bank(987654," 신사임당",500000,4321);
        myBank.showAccountInfo();
        myBank2.showAccountInfo();
        System.out.println();
        myBank.deposit(50000,1234);
        myBank.withdraw(200000,1234);
        myBank.withdraw(100000,1234);
        myBank2.withdraw(100000,4321);
        myBank2.deposit(200000,4321);
        System.out.println();
        myBank.showAccountInfo();
        myBank2.showAccountInfo();
        // 잔액이 마이너스인 계좌 객체를 생성하는 방법
        Bank mybank2 = new Bank(13579,"김차",-3000,789456);
        mybank2.showAccountInfo();



    }
}

















































































        /*
    과제 가이드라인
    1. 필드
        accountNum(계좌번호, 정수)
        accountHolder(예금주이름, 문자열)
        balance(잔액, 정수)
        pinNumber(비밀번호, 4 자리 정수 0 ~ 9999)

    2. 생성자
        기본 생성자
        계좌번호만 있는 생성자
        계좌번호, 예금주를 받는 생성자
        계좌번호, 예금주, 초기 잔액을 받는 생성자
        계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

    3. 메서드
        1) Setter / Getter
            특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                -> 잔액은 음수일 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능. -> 실패하면 "불가능한 비밀번호입니다."
        2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형으로 작성
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
            - 유효한 금액인지 검증(amount가 0초과인지) -> 실패하면 "불가능한 입력 금액입니다."
            - 콘솔창에
                0000원이 입금되었습니다. 현재 잔액 : 00000원

            withdraw(int amount, int inputPin) -> 출금 관련 메서드 / call2() 유형으로 작성
                - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                - 유효한 금액인지 검증(amount 0초과) -> 실패하면 "불가능한 입력 금액입니다."
                - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가입니다."
                - 콘솔창에
                    0000원이 출금되었습니다. 현재 잔액 : 0000원
        3) showAccountInfo() / call1() 유형으로 작성
            - 콘솔창에
                계좌 번호 : 123456
                계좌 소유자 : 홍길동
                현재 잔액 : 100000원
            라고 출력될 수 있도록 작성할 것.

        전체 실행 예

        계좌 번호 : 123456
        계좌 소유자 : 홍길동
        현재 잔액 : 100000원                     (십만원)

        계좌 번호 : 987654
        계좌 소유자 : 신사임당
        현재 잔액 : 500000원                     (오십만원)

        50000원이 입금되었습니다. 현재 잔액 : 150000원            # account1에 대한 입금(오만원)
        잔액이 부족하여 출금할 수 없습니다.                        # account1에서 200000원 출금 시도 실패 사례(이십만원)
        100000원이 출금되었습니다. 현재 잔액 : 50000원            # account1에 대한 출금(십만원 출금 성공)

        100000원이 출금되었습니다. 현재 잔액 : 400000원           # account2에 대한 출금(십만원 출금)
        200000원이 입금되었습니다. 현재 잔액 : 600000원           # account2에 대한 입금(이십만원 입금)

        최종 계좌 정보
        계좌 번호 : 123456
        현재 잔액 : 50000원                      (오만원)

        계좌 번호 : 987654
        현재 잔액 : 600000원                     (육십만원)
 */


