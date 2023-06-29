package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    //final 키워드.
    //종단, 변경불가의 의미
    //위치에 따른 의미
    //1. 지역변수 : 초기화 이후 값 변경 불가
    //2. 매개변수 : 호출시 전달한 인자 변경 불가
    //3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가.
    //4. 클래스(static)변수 : 프로그램 start 이후 값 변경 불가
    //5. non-static 메소드: 메소드 재작성(Overriding)불가
    //6. static 메소드 : 메소드 재작성(Overriding)불가
    //7. 클래스: 상속불가

    //특징
    //변경이 불가하기때문에 선언후 바로 초기화 필요

    //사용방법
    //1. 선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1;

    //2. 생성자를 이용하여 초기화.
    private final String NON_STATIC_NAME;
    public FinalFieldTest(String nonStaticName) {
        this.NON_STATIC_NAME = nonStaticName;
    }

    //static field에서의 사용방법
    //1. 선언과 동시에 초기화
    //	private static final int STATIC_NUM;	//에러남		//0으로 초기화 되기 때문에 이후 변경 불가능
    private static final int STATIC_NUM = 1;
    //생성자 이용 불가
    //생성자는 인스턴스가 생성되는 시점에 호출이 되기때문에, 그전에는 초기화 X
    //static은 프로그램이 시작될때 할당되기 때문에 초기화되지 않은상태로 선언됨

    private static final double STATIC_DOUBLE;
    //public FinalFieldTest(double staticDouble) {
    //		FinalFieldTest.STATIC_DOUBLE = staticDouble;
    //	}

    //초기화 블럭은 가능함 초기화 블럭은 추후에
    static {
        STATIC_DOUBLE = 0.5;
    }
}
