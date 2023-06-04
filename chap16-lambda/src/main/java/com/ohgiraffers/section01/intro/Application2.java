package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        //람다식의 활용
        //하나의 인터페이스내에 하나의 추상메소드만 가능하기때문에
        //메소드가 너무 많아질수 있음.
        //이때 내부 인터페이스의 활용법

        OuterCalculator.Sum sum=(x,y) -> x+y;
        OuterCalculator.Minus minus=(x,y) -> x-y;
        OuterCalculator.Multiple multiple=(x,y) -> x*y;
        OuterCalculator.Devide devide=(x,y) ->x/y;

        System.out.println("20과 10의 합 : "+sum.sumTwoNumber(20,10));
        System.out.println("20과 10의 차 : "+minus.minusTwoNumber(20,10));
        System.out.println("20과 10의 곱 : "+multiple.multiplyTwoNumber(20,10));
        System.out.println("20과 10의 나누기 : "+devide.devideTwoNumber(20,10));
    }
}
