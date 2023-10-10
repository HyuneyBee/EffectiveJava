package com.example.chapter01.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactoryApp {
    // 구체적인 타입을 숨길 수 있음
    public static void main(String[] args) {
        HelloService ko = HelloServiceFactory.of("ko");

        // 인터페이스 메서드를 정의하는 방법도 있다
        HelloService eng = HelloService.of("eng");

        // 등록된 HelloService 객체들을 다 가지고 올 수 있음
        ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
        Optional<HelloService> first = load.findFirst();
        first.ifPresent(h -> System.out.println(h.hello()));
    }
}
