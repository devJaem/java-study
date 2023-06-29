package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private  int nonStaticCount;
    private static int staticCount;

    //기본생성자
    public StaticFieldTest(){}

    public int getNonStaticCount() {return this.nonStaticCount;}

    public int getStaticCount(){
        //static 필드에 접근하기 위해서 클래스명.필드명으로 접근
        //this.으로도 접근은 가능하지만 this.은 잘 사용하지 않는다.
        return StaticFieldTest.staticCount;
    }

    //각각 두 필드 값을 1씩 증가시키기 위한 용도
    public void increaseNonStaticCount(){ this.nonStaticCount++;}

    public void increaseStaticCount(){ StaticFieldTest.staticCount++;}
}
