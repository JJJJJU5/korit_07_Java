package ch15_casting.centralcontrol;

public class CentralControlMain {
    private  Power[] deviceArray;

    public static void main(String[] args) {
        //각 클래스의 객체 생성

        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer = new Printer();
      //  Power[] powers = new Power[5];
        //이하의 코드는 powers 생성하면서 indexNumber가 고정되기 때문에
        //예시만 보여주고 사용하지 않음
        // Power[] powers = {new Computer(), new AirConditioner() , new Speaker()};

        // centralControl 객체를 만들면서 내부의 필드에 비어있는 Power[] 배열을
        // 집어넣었음
        CentralControl centralControl = new CentralControl(new Power[6]);

        centralControl.addDevice(computer1);  // 여기서 (암시적) 업캐스팅이 이루어짐.
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);
        centralControl.addDevice(printer);
        System.out.println();
        /*
            Mouse / LED 클래스를 정의하고 on / off 메서드를
            implement 하고 centralControlMain으로 와서
            각 객체를 생성한 다음
            CentralControlMain 객체에 집어 넣기
         */


        centralControl.powerOn();
        System.out.println();
        centralControl.poweroff();
        System.out.println("---------------------------------------------------");
//        for (int i = 0 ; i < 10 ; i++) {
//
//            System.out.println(i);
//
//        }
//        for (int i = 0 ; i < 10 ; i++) {
//            if ((i + 1) % 2 != 1) {
//                continue;           // continue : 해당 반복을 종료하고 다음 반복을 실행
//            }
//            System.out.println(i);
//        }
        centralControl.showInfo();
        System.out.println();
        speaker1.changeEqual();
        System.out.println();

        centralControl.perforrmSpecificMethod();

    }
}
