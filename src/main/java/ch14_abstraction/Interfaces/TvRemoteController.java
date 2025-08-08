package ch14_abstraction.Interfaces;

public class TvRemoteController {
   //필드 선언
    private  PowerButton powerButton;    // 접근지정자 클래스명 객체명 -> 여태까지 작성방법과 다름
    private  ChannelDownButton channelDownButton;
    private  ChannelUpButton channelUpButton;
    private  VolumeDownButton volumeDownButton;
    private  VolumeUpButton volumeUpButton;
    private  ModeChangeButton modeChangeButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton, ChannelUpButton channelUpButton , VolumeUpButton volumeUpButton ,
                              VolumeDownButton volumeDownButton ) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;

    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();

    }
    public  void  onPressedChannelDownButton() {
        channelDownButton.onPressed();

    }
    public  void onDownChannelDownButton() {
        channelDownButton.onDown();

    }
    public  void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }
    public String onUpChannelUpButton() {
        return channelUpButton.onUp();
    }
    public void onUpChannelUpButton2() {
        System.out.println(channelUpButton.onUp());
    }
    public void  onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton() {
        System.out.println(volumeUpButton.onUp());
    }
    public String onUpVolumeUpButton2(){
        return volumeUpButton.onUp();
    }




    //onPressedChannelUpButton() 메서드 / onUpChannelUpnButton() 구현하고
    //Main에서 실행하여
    //실행 예
    //채널을 한 칸 올립니다
    //채널을 계속 올립니다.
}

