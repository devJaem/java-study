package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        //배열의 주소전달 (얕은복사)
        System.out.println("매개변수로 전달받은 값 : " + iarr);

        //배열 값 출력
        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        //배열의0번 인덱스 변경
        iarr[0] = 99;

        //변경후 배열 값 출력
        System.out.print("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(RectAngle rectAngle){

        //인스턴스도 주소가 전달됨
        //인자로 전달하는 인스턴스와, 매개변수로 전달받은 인스턴스는 서로 동일 ( 얕은복사)
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        //넓이와 둘레 출력
        System.out.println("변경 전 사각형의 넓이와 둘레 ========================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        //너비, 높이 변경
        rectAngle.setWidth(100);		//자동형변환 적용됨
        rectAngle.setHeight(100);

        //값 변경후 다시 넓이와 둘레 출력
        System.out.println("변경 후 사각형의 넓이와 둘레 ========================");
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String...hobby){
        //가변길이의 배열은 몇개가 매개변수일지 모르기 때문에 뒤쪽에 작성
        //앞쪽 작성시 에러발생

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }
    //오버라이딩시 주의해야함.
    //	public void testVariableLengthArrayParameter(String...hobby) {
//
//		System.out.println("취미의 갯수 : " + hobby.length);
//		System.out.print("취미 : ");
//		for(int i = 0; i < hobby.length; i++) {
//			System.out.print(hobby[i] + " ");
//		}
//		System.out.println();
//	}
}
