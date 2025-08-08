package ch09_classes;

public class CarMain {

    public static void main(String[] args) {

        Car myCar = new Car();  //객체 생성

        myCar.color = "빨강"; // 필드값 대입
        myCar.speed = 160;

        myCar.drive();   // 메서드 호출
        myCar.displayInfo();

        Car yourCar = new Car(); // 객체 생성

        yourCar.color = "노랑"; // 필드값 대입
        yourCar.speed = 180;

        yourCar.brake(); // 메서드 호출
        yourCar.displayInfo();











    }
}
