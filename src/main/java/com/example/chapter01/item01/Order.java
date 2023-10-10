package com.example.chapter01.item01;

public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;

// 같은 매개변수 상황에 동시에 두가지 생성자를 만들어야 할 때는 아래와 같이 정적 팩토리 메소드 패턴을 이ㅛㅇ하는게 좋음
//    public Order(Product product, boolean prime){
//        this.product = product;
//        this.prime = prime;
//    }
//
//    public Order(boolean urgent, Product product){
//        this.product = product;
//        this.urgent = urgent;
//    }

    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
}

