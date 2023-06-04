package com.ohgiraffers.section03.grammar;

public enum UserRole1 {
    //enum은 상수 하나하나가 모두 인스턴스화 가능
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    //생성자도 만들수 있음.
    //default와 private 사용이 가능 외부에서 호출은 불가능
    //enum은 고정된 상수의 집합으로, 컴파일시에 모든 값이 결정되어야 함
    //동적으로 생성자를 이용해 값을 전달해줄수 없음 (런타임상태에서)
    //생성자 생성시 선언 마지막에 세미콜론 붙여야함 (문법)

    UserRole1(){}

    //메소드도 생성가능
    public String getNameToLowerCase(){
        return this.name().toLowerCase();
    }
}
