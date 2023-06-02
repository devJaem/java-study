package com.ohgiraffers.section03;

public interface InterProduct extends java.io.Serializable {

    //인터페이스 가 인터페이스 상속시 extends 기워드 사용
    //여러 인터페이스 다중상속 가능

    //인터페이스는 상수 필드만 작성 가능 (public static final)
    //변경되지 않기때문에 선언과 동시에 초기화 필요함

    public static final int MAX_NUM=100;
    //상수필드
    int MIN_NUM=10;
    //묵시적으로 public static final 로 지정됨

    //public InterProduct(){}
    //인터페이스는 생성자를 가질수 없음

    //public abstarct void nonStaticMethod(){}
    //구현부가 있는 nonStatic 메소드 가질수 없음

    public abstract void nonStaticMethod();
    //추상 메소드 가능

    //인터페이스 내부에 작성한 메소드는 묵시적으로 public abstract의 의미를 가짐
    //메소드 오버라이딩시 public으로 지정해야한다
    void abstMethod();

    public static void staticMethod(){

        System.out.println("InterProduct 클래스의 staticMethod 호출");
    }

    public default void defaultMethod(){

        System.out.println("InterProduct 클래스의 defaultMethod 호출");
    }
}

