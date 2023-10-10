package com.example.chapter01.item01;

interface HelloService {
    String hello();

    static HelloService of(String lang){
        if (lang.equals("ko")){
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
