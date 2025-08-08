package ch13_inheritance;

public class Animal {
    // 필드 정의
    private  String animalName;
    private  int animalAge;

    // 생성자 기본 생성자 하나 매개변수 생성자 하나 짜리 두개
    //AllArgs하나 해서 네 개 생성하세요.

    //getter / setter 생성


    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }
    public void move(){
        System.out.println();
    }
}
