package com.example.objectTDDStudy.day1;

public class Barista {
    private CoffeeMaker coffeeMaker;

    public Barista(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public Coffee order(Order order) {
        return coffeeMaker.make(order);
    }
}

/*
    order 메서드는 SRP 를 어기고 있다. * SRP = Single Responsibility Principle
    생성하라는 메세지와, order 라는 메세지.
    SRP 를 어기게되면 객체가 더이상 대체 불가능해진다.
*/

//public class Barista {
//    public Coffee order(Order order) {
//        return new CoffeeMaker().make(order);
//    }
//}
