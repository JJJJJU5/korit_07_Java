package ch16_objects;

public class ObjectTest {
    private String name;
    private String address;

    //기본 생성자 / AllAgsConstructor를 정의
    //getter / setter를 정의
    //showInfo() caal1() 형식으로 정의
    /*
    실행 예
    이름 : ㅇㅇㅇ
    주소 : ㅇㅇㅇ

    Main으로 가서 objectTest1에
    이름 ㅇㅇㅇ 주소 ㅇㅇㅇ set하고
    showInfo()를 호출
     */

    public ObjectTest() {
    }

    public ObjectTest(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    public String getAddress() {
        return address;

    }

    public void setAddress(String address) {
        this.address = address;

    }

    public  void showInfo() {
        System.out.println("이름:" + getName()+ "\n주소지:" + getAddress());

    }

    @Override
    public String toString() {
        return ("이름:" + getName() + "\n주소지:" + getAddress());
    }


}
