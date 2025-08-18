package ch23_lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Java!");
            }
        }; // 객체 정의이기 때문에 ; 필수
        runnable.run();
        // 1. Runnable -> call1()
        Runnable lambdaRunnable = () -> System.out.println("Hello, Lambda!");
        lambdaRunnable.run(); // 윗줄에는 메서드 명이 없음 . 아까 add / sum에서 calculate를 추론 할 수 없었던 이유 중 하나

        // 다른 유형의 함수형 인터페이스 실행 예제
        // 2. Supplier -> call3()
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";
        System.out.println(stringSupplier.get()); // 기존 method 관련 + 람다식 지식 필요

        // 3. Cunsumer -> call2()
        Consumer<String>stringConsumer = (message) -> System.out.println("메세지 :" + message);
        stringConsumer.accept("오늘 전반적인 수업 내용은 여기서 끝");
    }
}
