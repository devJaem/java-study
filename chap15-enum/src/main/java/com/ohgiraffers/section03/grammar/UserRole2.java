package com.ohgiraffers.section03.grammar;

public enum UserRole2 {

    //일반 정수,상수가 아님 특정값을 지정할수 있음
    GUEST("관리자"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    //특정값을 지정할경우 매개변수가 존재하는 생성자가 필요함.
    //괄호 안에 넣은 값이, 생성자로 전달되며 enum 인스턴스 생성
    //인스턴스가 오직 1개만 생성되는 싱글톤 객체
    private final String description;


    UserRole2(String description){
        System.out.println("description : "+ description);
        // 필드 존재시 필드값 변경이 가능하다.
        this.description=description;
    }

    public String getDescription(){
        return this.description;
        //정수값 외의 값을 외부에서 사용시 필드로 작성한 값을 반환이 가능하다.
    }
}
