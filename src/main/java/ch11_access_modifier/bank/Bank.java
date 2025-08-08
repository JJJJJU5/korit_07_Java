package ch11_access_modifier.bank;
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
public class Bank {
    private int accountNum;
    private  String accountHolder;
    private  int balance;
    private  int pinNumber;
    private int amount;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        //여기에 수정 로직 0원 초과가 입금이 가능해야 하므로
        if (balance <= 0){
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance; // 이거 초기 잔액 세팅이기 때문에 입금은 얘로 이루어 질수없음
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        int PinNum = 0;
        if(PinNum > 9999 || PinNum < 0 ) {
            System.out.println("불가능한 비밀번호 입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount , int inputPin){ // 입금
            if (pinNumber != inputPin) {
                System.out.println("비밀번호가 틀렸습니다.");
                return;
            }
            if(amount <= 0) {
                System.out.println("불가능한 입금 금액입니다.");
                return;
            }
            balance += amount;

        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 :" + balance + "원");
        this.amount = amount;

    }
    public  void withdraw(int amount , int inputPin) { // 출금
            if (this.pinNumber != inputPin) { // 비밀번호 체크
                System.out.println("비밀번호가 틀렸습니다.");
                return;
            }
            if (amount <= 0 ) { // 입금 금액이 0원 초과인지 체크
                System.out.println("출금 금액은 0원보다 커야 합니다.");
                return;
            }
            if (balance < amount) { // 잔액보다 출금 금액이 많은지 체크
                System.out.println("잔액이 부족합니다. 현재 잔액: " + balance + "원");
                return;
            }
                balance -= amount; // 출금하고 남은 금액 표시
                System.out.println(amount + "원이 출금되었습니다. 현재 잔액 :" + balance + "원");

        }


    void showAccountInfo() {
        System.out.println("계좌번호 :" + accountNum +" \n계좌소유자 :" + accountHolder + " \n현재 잔액 : " +balance + " \n비밀번호 : " + pinNumber);

    }

}

