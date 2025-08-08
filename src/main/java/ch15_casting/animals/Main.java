package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fatch();

        Animal animal1 = dog1; // 업캐스팅 #1
        // 예시
        int a = 1;
        animal1.makeSound();  // 결과값 : 개가 짖습니다.. 즉 재정의된 method가 호출됨
        //animal1.fatch(); // 불가능
        Animal animal2 = new Dog(); // 이 형태가 A a = new B(); 형태
        animal2.makeSound(); // 개가 짖습니다. 여전히 fatch()는 사용하지 못함

        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성했을 경우
            1. Override가 적용된 메서드, 즉 자식 클래스의 메서드가 호출됨.
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능.

            재정의된 method 버전으로 호출이 될거라면 에초에
            클래스B 객체명 = new 클래스B()로 생성해버리면 재정의된 method도 호출되고 고유 method도
            호출할 수 있으니까 더 쉬운것이 아닌가?

         */

        Animal animal3 = new Animal();
        animal3.makeSound();

        //연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof  Animal; //true
        System.out.println(result1);
        boolean result2 = animal1 instanceof Dog; //true
        System.out.println(result2);

        // 업캐스팅이 이루어지지 않았더라도 Dog dog1 = new Dog();로 만든 객체 역시 true
        boolean result3 = dog1 instanceof  Animal;
        System.out.println(result3);
        boolean result4 = dog1 instanceof Dog;
        System.out.println(result4);

        // animal3의 경우 Animal animal = new Animal();로 생성했음
        boolean result5 = animal3 instanceof  Animal;
        System.out.println(result5);          // true
        boolean result6 =animal3 instanceof  Dog;
        System.out.println(result6); // false

        System.out.println("↑ 업캐스팅 파트 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가에 주목 ");
        //-------------------------------------------------------------------------------------------------------------
        System.out.println("↓ 다운 캐스팅 파트 ");
        /*
            다운캐스팅은'명시적'으로 이루어져야 한다
            방법
            (클래스명)객체명; ->(int)2,3;과 같은 방식. conversion의 객체 버전이라고 생각하면 됨
            그래서 기본 자료형의 형변환에서 벗어나서 참조 자료형까지 고려해야 됨

         */
        Dog dog2 = (Dog) animal2; // 다운캐스팅 방법 -> 위에 보면 Animal animal2 = new Dog()
        //으로 생성해서 dog2 객체명은 없음
        dog2.makeSound();
        dog2.fatch();
        // dog2로 새로운 객체명을 선언하고 거기에 명시적 참조 자료형 캐스팅을 적용하여 Animal 클래스의
        // 인스턴스인 animal2를 downcasting했음
        // 그 결과 원래도 되던 재정의 버전의 makeSound(); 호출은 변함이 없고
        // Dog 클래스의 고유 메서드인 fatch();도 호출이 가능했음
        // 여전히 B b = newB(); 로 생성하면 더 편하지 않나?

//        Dog dog3 = (Dog) animal3; // downcasting을 하는 과정에서 오류가 발생
//        dog3.makeSound();   // 이 부분도 호출을 하지 못하는 상황

        /*
           69번 라인에서 오류가 발생함
           즉 animal3를 생성할 때 Animal 클래스의 생성자를 호출해서 만들었기 때문에
           (A a = new A();)
           하위 클래스의 인스턴스로 다운캐스팅하는 것이 붉라능

           이상을 해결하기 위해서는
         */
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출되는 생성자가 서로 달라야 됨 ( 둘은 상속관계여야 함)
        // 그러면 현재 코드라인에서 오류가 뜨지 않아서 잘못된 다운캐스팅이 이루어지는지에 대한
        // 확인이 불가능한 상황 , 이를 해결하기 위한 것이 instanceof 연산자 이다
        System.out.println("animal4 검증파트");
        if(animal4 instanceof  Dog) {
            Dog dog4 = (Dog)animal4;

            dog4.makeSound();
            dog4.fatch();
        }
        if (animal3 instanceof  Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fatch();

        } else {
            System.out.println("불가능한 다운캐스팅");
        }
    }
}

