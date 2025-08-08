package solo;

public class ssss {
    private String name;
    private int age;

    public ssss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 4) {
            System.out.println("이름을 잘못 입력하셨습니다.");
            return;
        }
        this.name = name;

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("나이를 잘못 입력하셨습니다.");
            return;
        }
        this.age = age;
    }
}
