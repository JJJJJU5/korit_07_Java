package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        //각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
      //  Power[] powers = new Power[5];
        //이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에
        //예시만 보여주고 사용하지 않음
        // Power[] powers = {new Computer(), new AirConditioner() , new Speaker()};

        // centralControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을
        // 집어넣었음
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(computer1);  // 여기서 (암시적) 업캐스팅이 이루어짐.
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);


    }
}
