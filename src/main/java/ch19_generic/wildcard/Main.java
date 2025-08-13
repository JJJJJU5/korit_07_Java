package ch19_generic.wildcard;

public class Main  {
    // 메서드 정의 영역
    // 현재 AnimalData 에서는 필드로 들어온 객체가 Animal 클래스의 서브 클래스인지
    // 아닌지를 구분할 수 없기 때문에
    // 이를 판단하는 메서드를 Main에 정의함
    public  AnimalData<? extends Animal> getAnimal(int fleg){
        if(fleg ==1 ) {
            AnimalData<Human> animalData = new AnimalData<>(new Human());
            return animalData;
        } else if (fleg ==2 ) {
            AnimalData<Tiger> animalData = new AnimalData<>(new Tiger());
            return animalData;
        }
        return null;
    }




    public static void main(String[] args) {

        AnimalData<Tiger> animalData1 = new AnimalData<>(new Tiger());
        AnimalData<Human> animalData2 = new AnimalData<>(new Human());
        AnimalData<Car> animalData3 = new AnimalData<>(new Car());

        /*
            현재 상황에서는 AnimalData에 Car 객체가 들어가있지만 오류가 발생하지 않는다.
            Generic 개념 때문에, T에는 어떤 클래스도 들어갈 수 있기 때문
         */
        animalData1.showData();
        animalData2.showData();
//      animalData3.showData(); // 오류 발생

        /*
            animalData3.showData()에서 오류가 발생함을 알 수있음
            AnimalData 클래스에서 정의된 메서드 로직을 확인해보면
            필드를 (Animal)로 형변환시키는데, Car 클래스의 인스턴스를 Animal로
            형변환시키는 것이 불가능하기 때문

            즉 제네릭'만을' 사용했을 떄 생길 수 있는 문제점.
         */

        // .getAnimal() 메서드 호출을 위해 객체 생성
        Main main = new Main();
        AnimalData<? extends  Animal> animalData4 = main.getAnimal(1);
        AnimalData<? extends  Animal> animalData5 = main.getAnimal(2);
        AnimalData<? extends  Animal> animalData6 = main.getAnimal(3);

        /*

           .getAnimal()을 정의하지 않았다고 가정한다면 현재 animalData 4,5,6의
           필드에 어떤 클래스의 객체가 들어가있는지를 모름.

            animalData6에는 어떤 값이 들어있어야 하는지 = Null
         */
        if(animalData4 != null) {
            animalData4.showData();
        } if(animalData5 != null) {
            animalData5.showData();
        } if(animalData6 != null) {
            animalData6.showData();
        } else {         //animalDat == Null이라면
            System.out.println("아무것도 없습니다.");
        }



    }
}
