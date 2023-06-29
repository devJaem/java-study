package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable { //클래스 영역 시작

    //클래스영역 과 변수 정리
    //필드==멤버변수(클래스가 가지는 멤버)=전역변수(클래스 전역에서 사용가능한 변수)

    //인스턴스 변수 (non-static-field) 생성 시점에 사용 가능한 변수
    private int globalNum;

    //클래스 변수 (static filed) 정적 영역(클래스)에 생성되는 변수
    private static int staticNum;

    public void testMethod(int num){//메소드 영역 시작

        //메소드영역
        //메소드 영역에서 작성하는 변수는 지역변수
        //괄호 안에 선언하는 변수는 매개변수 (지역변수의 한 종류)
        //지역변수, 매개변수 모두 메소드 호출시 stack을 할당받고 stack에 생성

        int localNum;

        //매개변수는 호출시 값이 넘어와서 변경되기 때문에 초기화 X
        System.out.println(num);

        //지역변수는 선언 외에 다시 사용하기위해서는 초기화가 필요
        //		System.out.println(localNum);

        System.out.println(globalNum);		//전역 변수는 클래스 전역에서 사용 가능하다.
        System.out.println(staticNum);
    }	//메소드 영역의 끝

    //새로운 메소드 만든후 전역변수와 지역변수에 접근
    public void testMethod2(){ //새로운 메소드

//		System.out.println(localNum); 		//지역변수는 해당 지역(블럭 내)에서만 사용 가능하다.
        System.out.println(globalNum);		//전역변수는 다른 메소드에서도 사용 가능하다.
        System.out.println(staticNum);
    }
}//클래스 영역 끝
