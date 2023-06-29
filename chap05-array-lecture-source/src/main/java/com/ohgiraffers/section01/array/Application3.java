package com.ohgiraffers.section01.array;

public class Application3 {

	public static void main(String[] args) {

		//배열에 초기화되는 자료형별 기본값

		//기본적으로 배열을 선언하고 할당하게 되면
		//배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
		//heap영역은 값이 없는 빈 공간이 존재할 수 없다.

		//값의 형태 별 기본값
		//정수 : 0
		//실수 : 0.0
		//논리 : false
		//문자 : \u0000
		//참조 : null

		int[] iarr = new int[5];
		
		//int = 0
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		System.out.println(iarr[3]);
		System.out.println(iarr[4]);
		
		//반복문으로 확인해보기
		for(int i = 0; i < iarr.length; i++){
			System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
		}
		
		//블럭을 활용한 초기화
		int[] iarr2 = {11, 22, 33, 44, 55};
		
		//형식은 다양함
		int[] iarr3 = new int[] {11, 22, 33, 44, 55};
		
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("iarr3의 길이 : " + iarr3.length);
		
		//초기화값 확인
		for(int i = 0; i < iarr2.length; i++) {
			System.out.println("iarr2[" + i + "] : " + iarr2[i]);
		}
		
		for(int i = 0; i < iarr3.length; i++) {
			System.out.println("iarr3[" + i + "] : " + iarr3[i]);
		}
		
		//문자열도 초기화 가능
		String[] sarr = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < sarr.length; i++){
			System.out.println("sarr[" + i + "]의 값 : " + sarr[i]);
		}
	}
}
