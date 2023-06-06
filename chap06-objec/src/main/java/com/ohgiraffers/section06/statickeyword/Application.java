package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        //static 키워드
        //정적 메모리 영역에 프로그램이 시작될때 할당하는 키워드.
        //인스턴스를 생성하지 않고도 사용할 클래스의 멤버에 지정할수 있음.
        //여러 인스턴스가 공유하여 사용할 목적의 공간
        //남발시 유지보수와 추적이 힘든 코드가 됨
        //명확한 목적이 존재할 경우만 사용권장
        //ex)singletotn 객체를 생성할때

        //필드에서 static 사용 객체 생성
        StaticFieldTest sft1=new StaticFieldTest();

        //sft1객체의 두 필드의 값 확인
        System.out.println("non-static filed : " + sft1.getNonStaticCount());
        System.out.println("static filed : " + sft1.getStaticCount());

        //두 필드의 값 1 증가
        sft1.increaseStaticCount();
        sft1.increaseNonStaticCount();

        //sft1객체의 두 필드의 값 변경후 확인
        System.out.println("non-static filed : " + sft1.getNonStaticCount());
        System.out.println("static filed : " + sft1.getStaticCount());

        //새로운 static 사용 객체2(클래스의 인스턴스) 생성
        StaticFieldTest sft2 = new StaticFieldTest();

        //sft2객체의 두필드값 확인
        System.out.println("non-static filed : " + sft2.getNonStaticCount());		//새로 생성했기 때문에 0
        System.out.println("static filed : " + sft2.getStaticCount());				//기존 생성되고 1증가된 1을 유지하고있음

        //인스턴스 변수의 경우 sft1과 sft2 두개의 인스턴스가 서로 값을 공유하지 못함
        //따라서 생성할때마다 0으로 초기화됨
        //Static필드의 경우 프로그램 종료시까지 유지한다.
        //여러개의 인스턴스가 같은 공간을 공유할 목적으로 static 키워드 사용

        //StaticMethodTest 인스턴스 생성후 호출
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        //static 메소드도 호출은 가능
        //인스턴스를 생성하지 않고 호출하는 방식으로 사용
        //static 메소드 자체가 인스턴스생성응ㄹ 하지않고 호출할 목적으로 만들기 때문에
        //바로 호출하는것이 좋음.

        smt.staticMethod();//권장하지않음

        StaticMethodTest.staticMethod();//권장함
    }
}
