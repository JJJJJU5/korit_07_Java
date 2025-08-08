package ch14_abstraction.Interfaces;

public class ModeChangeButton extends Button {

    private boolean status;
    @Override

    public void onPressed() {
        if (status) {

            status = false;
            System.out.println("냉방");

        } else {
            status = true;
            System.out.println("난방");
        }
    }
}