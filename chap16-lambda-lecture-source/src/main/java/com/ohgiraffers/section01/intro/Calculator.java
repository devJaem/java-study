package com.ohgiraffers.section01.intro;

//자바는 메소드를 독립적으로 선언할수 없음
//클래스나 인터페이스 내부에서만 선언이 가능함
//람다식은 인터페이스를 활용
//인터페이스 내부에 하나의 추상메소드가 선언된 인터베이스만 람다식 사용가능
//위 특징을 가진 인터페이스를 functional interface 라고 한다.
//@FunctionalInterface 어노테이션 사용

@FunctionalInterface
public interface Calculator {
    public int sumTwoNumber(int a, int b);

//    public int minTwoNumber(int a, int b);
    //람다식 을 사용하기위해 추상메소드 2개는 사용불가
}
