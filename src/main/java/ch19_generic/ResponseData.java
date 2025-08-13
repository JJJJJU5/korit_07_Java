package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data //Getter , Setter ,ToString, EqualsAndHashCode
public class ResponseData<T> {
    private  String message;
    private  T data;
}
/*
    제네렉을 쓰려면 class에 추가적인 명령어가 필요함
    <>이 부분
    public class ResponseData *<T>*
 */