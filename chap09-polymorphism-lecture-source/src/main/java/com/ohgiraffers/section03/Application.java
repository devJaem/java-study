package com.ohgiraffers.section03;

public class Application {
    public static void main(String[] args) {

        //인터페이스의 이해
        //클래스와 유사한 형태
        //추상메소드와 상수필드만 가질수 있음.
        //추상클래스와 비슷하게 사용됨 (일관된 인터페이스를 제공하기 위함)
        //그러나 자바의 단일상속의 단점을 극복

        //여러곳에서 혼용되기 때문에 주의가 필요함

        //InterProduct interProduct =new Interproduct();
        //인스턴스를 생성할수 없고, 생성자 존재하지 않음
        InterProduct interProduct=new Product();
        //레퍼런스 타입으로 사용 가능

        interProduct.nonStaticMethod();
        interProduct.abstMethod();
        //추상메소드 오버라이딩한 메소드로 동적바인딩에 의해 호출됨

        interProduct.defaultMethod();
        //오버라이딩하지 않으면 인터페이스의 default 메소드로 호출됨

        InterProduct.staticMethod();
        //static 메소드는 인터페이스명.메소드명();으로 호출

        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);
        //상수필드도 인터페이스명.필드명 으로 접근가능함



    }
}

