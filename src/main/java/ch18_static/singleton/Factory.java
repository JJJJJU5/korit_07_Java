package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 정의
    private String factoryName;

    //메서드 정의
    public SmartPhone produceSmartPhone() {

        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");

        // 접근 지정자를 지정하지 않았기 때문에 default {} 영역 내에 중괄호가 있으니 지역변수
        String model = "갤럭시S26";
        String serial;

        //밑에 삼성도 지역변수지만,
        Samsung samsung = Samsung.getInstance();
        //Samsung 객체를 생성 -> 싱글톤 썼으니까 동일한 객체에 계속 대입
        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴 타입이 SmartPhone 이므로 SmartPhone 객체가 나와야 하는데
        // 스마트폰 객체를 생성 할 때 AllArgsConstructor 이기 때문에 전부 채워져야만 생성됨

        //
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model,serial);

        return  smartPhone;
    }
}
