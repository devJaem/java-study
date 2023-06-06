package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        //파라미터로 사용가능한것
//        1. 기본자료형
//        2. 기본자료형 배열
//        3. 클래스 자료형
//        4. 클래스자료형 배열
//        5. 가변인자

        //파라미터 타입별 호출 테스트
        ParameterTest pt = new ParameterTest();

        //기본자료형 8가지 전부 가능
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        //기본 자료형 배열8가지 전부 가능
        int[] iarr = new int[] {1, 2, 3, 4, 5};
        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        //호출로 값 변경 확인
        System.out.print("변경 후 원본 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        //클래스 자료형 가능
        RectAngle r1 = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        //호출후 값 변경 확인
        System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
        r1.calcArea();
        r1.calcRound();

        //		pt.testVariableLengthArrayParameter();			//에러남	//인자가 아무것도 없는 경우 에러 발생
        pt.testVariableLengthArrayParameter("홍길동");			//가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArrayParameter("유관순", "볼링");		//1개도 가능
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");	//여러 개도 가능
        pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스", "서예", "떡썰기"});	//배열도 가능

        //가변인자는 오버라이딩시 유의
        //모호하면 컴파일 에러가 발생하기때문
        //가변배열을 매개변수로 오버로딩하지 않는편이 좋음.

    }
}
