package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){
        this.count++;

        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod(){
        //this.count++; // 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 주소가 들어갈수 없음.

        System.out.println("staticMethod 호출됨...");
    }
}
