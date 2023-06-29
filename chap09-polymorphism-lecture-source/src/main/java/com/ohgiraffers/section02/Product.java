package com.ohgiraffers.section02;

public abstract class Product {

    private int nonStatidField;
    private static int staticFiled;

    public  Product(){}

    public static void nonStaticMethod(){}

    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 호출함");
    }

    public abstract void abstMethod();
}
