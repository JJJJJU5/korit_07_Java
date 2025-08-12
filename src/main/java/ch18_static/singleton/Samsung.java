package ch18_static.singleton;

import lombok.Getter;

/*
    ProductView와 인터넷에서의 레퍼런스를 참조하여
    Samsung 클래스의 싱글톤 패턴을 작성하시오.

 */
public class Samsung {
    private static Samsung instance;
    //일반 필드 (멤버 변수) 정의
    @Getter                //getCompany()만 만들겠다는 의미
    private  String company;
    private  int serialNumber;

    private Samsung() {
    company = getClass().getSimpleName(); // 결과값 Samsung
    serialNumber = 20250000;             //객체 생성시 필드값을 초기화


    }
    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return  model +"_" +  ++serialNumber;        // 싱글톤으로 작성했으니 객체 하나만 생성
        // Main 단계에서 다수의 객체에서 createSerialNumber()를 호출 하더라도 전혀 serialNumber가 중복되지
        // 않는다라고 볼 수 있음 그러면 정적 변수로 선언하고 다수의 삼성 객체를 만들어도 serialNumber와 겹치지 않는가?
        // 라고 생각하면 맞는 말 그러면 Samsung이라는 회사 갯수가 백만개라는 전재하에 가능
    }
}




