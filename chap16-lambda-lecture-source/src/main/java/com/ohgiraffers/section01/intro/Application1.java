package com.ohgiraffers.section01.intro;

public class Application1 {

    public static void main(String[] args) {
        //람다식
        //메소드를 하나의 식으로 표현함
        //메소드 이름이 없는 익명함수.
        //람다 계산법을 기초로 만들어짐
        //f(x,y)=x*y
        //변환
        //(x,y) -> x*y

        //사용이유
        //메소드를 단순하게 표현
        //컬렉션, 스트림을 연계하여 데이터 조작이 쉬워진다.
        //불필요한 코드 제거가 가능함

        //단점
        //배우는 시간이 오래걸림(러닝커브)
        //객체지향 사상과는 맞지않아서 호불호가 갈림

        //표현식 매개변수 없는경우
        // () -> { ... }
        //매개변수 있는 경우
        //(변수,변수,...) -> { ... }

        //매개변수의 타입은 추론이 가능하여 작성하지 않아도 된다.
        //매개변수가 1개일 경우 ()가 생략 가능하다.
        //실행문이 한줄일 경우 {}는 생략 가능하다.

        Calculator c1=new CalculatorImpl();
        System.out.println("10과 20의 합은 : "+c1.sumTwoNumber(10,20));
        //인터페이스 활용 방식
        //=================================================================
        Calculator c2= new Calculator() {
            @Override
            public int sumTwoNumber(int a,int b){
                return a+b;
            }
        };
        System.out.println("20과 30의 합은 : "+c2.sumTwoNumber(20, 30));
        //익명클레스 활용 방식
        //==================================================================
        Calculator c3=(x,y) ->x+y;
        System.out.println("40과 50의 합은 : "+c3.sumTwoNumber(40,50));
        //람다식 활용 방식
        //===================================================================
    }
}
