package ch14_abstraction.Interfaces;

/*
    powerButton 포함시킬 것
    TemperatureDownButton
    TemperatureUpButton
    ModeChangeButton > 버튼 한 번 누를 때 마다 모드가 변환되어야 함
    냉방 ㅡ> 난방
        :Press 버튼을 활용하여 한 번 누르면 그 다음 다음 모드로 이동해야 함.
        (PowerButton의 로직을 활용하여 메서드 작성)

    AllArgConstructor를 정의하고,

    실행 예
    에어컨 리모컨 객체가 생성되었습니다.
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다
    온도를 한 칸 내립니다.
    온도를 계속 올립니다.
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.



 */
public class AirConditionerController {

    private TemperatureDownButton temperatureDownButton;   // 접근지정자 클래스명 객체명
    private TemperatureUpButton temperatureUpButton;
    private PowerButton powerButton;
    private ModeChangeButton modeChangeButton;

    public AirConditionerController(TemperatureDownButton temperatureDownButton, TemperatureUpButton temperatureUpButton, PowerButton powerButton, ModeChangeButton modeChangeButton) {
        this.temperatureDownButton = temperatureDownButton;
        this.temperatureUpButton = temperatureUpButton;
        this.powerButton = powerButton;
        this.modeChangeButton = modeChangeButton;
    }

    public void onPressedPowerBotton() {
        powerButton.onPressed();
    }
    public void  onPressedtemperatureDownButton(){
        temperatureDownButton.onPressed();
    }
    public void onDowntemperatureDownButton() {
        temperatureDownButton.onDown();
    }
    public void  onPressedtemperatureUpButton() {
        temperatureUpButton.onPressed();
    }
    public void onUptemperatureUpButton() {
        System.out.println(temperatureUpButton.onUp());
    }
    public void onPressedModeChangeBotton(){
        modeChangeButton.onPressed();
    }



}




