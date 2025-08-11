package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(3545);
        user1.setEmail("a@test.com");
        user1.setName("오정욱");
        System.out.println(user1);
        System.out.println();

        System.out.println("Lombok을 통한 Getter 사용");
        System.out.println("uesrname : " + user1.getUsername());
        System.out.println("email: " + user1.getEmail());
        System.out.println("name : " + user1.getName());
        System.out.println("비밀번호는 보안 상의 이유로 제공하지 않습니다.");
        System.out.println();
        //getter 사용
        UserEntityLombok user2 = new UserEntityLombok();









    }
}
