package com.ohgiraffers.section03;

public class Product extends Object implements InterProduct, java.io.Serializable{
    //implements -인터페이스 상속 키워드
    //다중상속이 가능
    //extends와 별개로 인터페이스도 추가 상속 가능
    //extends 가 앞, implements가 뒤에 작성 (문법)
    //static 매소드는 오버라이딩 불가!
    //default 메소드는 인터페이스에서만 작성 가능
    @Override
    public void nonStaticMethod(){

        System.out.println("InterProduct의 NonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod(){

        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출");
    }
    @Override
    public void defaultMethod(){

        System.out.println("Product 클래스의 defaultMethod 호출됨...");
    }
}
