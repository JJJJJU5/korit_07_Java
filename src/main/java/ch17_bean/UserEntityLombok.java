package ch17_bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


//여기에 애너테이션을 달면 class level(클래스 전체)
@Data
@Getter
@Setter
public class UserEntityLombok {
    //여기에 달면 field level(필드에만 적용)
        private int username;
        private int password;
        private String email;
        private String name;



}
