package com.ohgiraffers.section02;

public class SmartPhone extends Product {
    // Product 상속
    // 두개 이상의 클래스 상속 X
    // 추상메소드는 반드시 오버라이딩

    public SmartPhone(){}

    @Override
    public void abstMethod(){

        System.out.println("Product 클래스의 abstMethod를 오버라이딩함");
    }

    public void printSmartPhone(){

        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함");
    }
}
