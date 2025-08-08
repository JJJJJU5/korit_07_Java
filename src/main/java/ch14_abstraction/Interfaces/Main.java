package ch14_abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
//       PowerButton powerButton = new PowerButton();
//       ChannelDownButton channelDownButton= new ChannelDownButton();
//       ChannelUpButton channelUpButton = new ChannelUpButton();
//
//
//       TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton,channelDownButton,channelUpButton
//        );
//
//       powerButton.onPressed();
//       tvRemoteController.onPressedPowerButton();

        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법

        TvRemoteController tvRemoteController = new TvRemoteController(
         new PowerButton(), new ChannelDownButton() , new ChannelUpButton(),
        new VolumeUpButton() , new VolumeDownButton());

        AirConditionerController airConditionerController = new AirConditionerController(new TemperatureDownButton(),
                new TemperatureUpButton(), new PowerButton(), new ModeChangeButton());


        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        System.out.println();
        tvRemoteController.onPressedChannelUpButton();
        System.out.println(tvRemoteController.onUpChannelUpButton());
        tvRemoteController.onUpChannelUpButton2();
        System.out.println();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        System.out.println();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton2());
        System.out.println();

        airConditionerController.onPressedPowerBotton();
        airConditionerController.onPressedtemperatureDownButton();
        airConditionerController.onDowntemperatureDownButton();
        airConditionerController.onPressedtemperatureUpButton();
        airConditionerController.onUptemperatureUpButton();
        airConditionerController.onPressedModeChangeBotton();
        System.out.println();
        airConditionerController.onPressedModeChangeBotton();










    }

}
