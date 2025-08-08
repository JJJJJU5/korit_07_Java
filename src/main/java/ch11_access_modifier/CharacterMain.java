package ch11_access_modifier;

import javax.naming.Name;

/*
    목표 : 객체 지향 설계 및 접근 지정자 이해를 바탕으로
    다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고
    이를 CharacterMain 클래스에서 가능 테스트를 수행할겁니다.

    클래스 설계
    1. 필드
    name - 캐릭터 이름 ( 공개 가능 ) String "" ;
    health - 체력 -> 읽기만 허용
    power - 공격력 -> 같은 패키지만
    skill - 스킬이름 -> 자식 클래스만
    exp - 경험치 -> 외부에서 원천 차단

    Character 클래스의 인스턴스인 warrior를 생성하고
    이름 전사
    체력 100
    공격력 200
    스킬 세로베기
    exp 30
    으로 기본 생성자를 통해 생성하고. setter를 통해서 데이터를 집어 넣으시오.

    2. 메서드 정의
    getHealth() -> 체력 값을 반환하는 getter -> public / 이미 자동완성으로 만들어짐
    attak() -> 공격 시 콘솔 창에
        name 이 power로 공격!
        name이(가) 경험차 amount을(를) 얻었습니다. -> 라고 두 줄 출력되게 작성 할 것. call1() 유형
    heal() -> 체력을 10 회복하고 , 현재 체력 출력
        체력이 10 회복 되었습니다. 현재 체력 : health(숫자로 출력되어함)
    gainExp(int amount) -> call2() 유형이고 경험치를 증가시키는 메서드(내부 전용)
    실행 예
    name이(가) 경험자 amount을(를) 얻었습니다.


 */

class Charater {
    //필드 선언
    public String name;    // 공개 가능
    private int health;        // 읽기만 허용
    int power;           // 같은 패키지만
    protected String skill;       // 자식 클래스만
    private int exp;           //원천 차단

    //생성자 정의 ( 캐릭터 생성시 필수적으로 요구되는 애들만 매개변수로 받는 매개변수 생성자)

    public Charater(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100; // 초기 체력 ( 메개변수가 없어서 , 객체 생성시에 무조건 체력이 100으로 고정된다는 의미 )
        this.exp = 0;
    }


    // 메서드 생성





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

   // attack()
    public  void  attack(){
        System.out.println(name + " 이(가) " + power + "의 힘으로 공격! ");
        // 공격하고 나서 경험치를 얻으려면 -> 외부에서 공격 이외의 방식으로 경험치를 강제적으로
        // 획득할 수 있는 버그를 막고 싶으면 위의 가이드에서 작성했떤 hetExp()는 외부에서 실행이 되면 안되어야 함.
        this.gainExp(30);

    }

    private void gainExp(int amount) {
        exp += amount;
        System.out.println(name + " 이(가) 경험치를 " + amount + " 얻었습니다.");
    }

    public void heal(){
        health += 10;
        System.out.println(name + "의 체력이 회복되었습니다. 현재 체력 : " + health );


    }


}


public class CharacterMain {
    public static void main(String[] args) {
        Charater warrior = new Charater("전사",200,"세로베기");

        System.out.println(warrior.getHealth());


//       warrior.setName("전사");
//        warrior.setHealth(100);
//        warrior.setPower(200);
//        warrior.setSkill("세로베기");
//        warrior.setExp(30);

       // warrior.gainExp(1000); // gainExp()는 private 처리 했기 때문에 직접적으로 매인 메서드에서 사용 할 수 없음.

        warrior.attack();
        warrior.heal();

        System.out.println(warrior);

        /*
        이상의 코드에서 중점적으로 학습해야 할 점은
        접근 지정자의 설정 수준에 따라서 setter / getter가 필요한 사례가 있고 아닌 사례가 있다는 점
        예를 들어 게임을 하거나 SNS를 한다고 쳤을 때 닉네임의 경우 누구나 볼 수 있다.
        그렇다면 닉네임 필드는 public으로 설정이 되어 있고
        그렇기 떄문에 hetter를 통한 닉네임 호출은 필요가 없어서 이상의 코드에서 getName()메서드는 쓸모가 없다

       어떤 클래스 / 필드 / 메서드를 어떤 접근 지정자를 설정 해야할 지도 고민해야 되고

       웬만해서 필드는 private으로 설정하는 것이 좋다 . getter / setter를 통한 우회 설정 및 조회를 목표
         */

    }
}
