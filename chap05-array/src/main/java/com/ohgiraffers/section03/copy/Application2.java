package com.ohgiraffers.section03.copy;

public class Application2 {

	public static void main(String[] args) {

		//얕은 복사의 활용
		//얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
		//리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.


		String[] names = {"홍길동", "유관순", "이순신"};
		
		//얕은복사 확인을 위한 hashcode 출력
		System.out.println("names의 hashcode : " + names.hashCode());
		

		//배열을 매개변수로 전달받는 출력기능을 하는 메소드 추가
		//동일한 hashcode
		//이처럼 다른 메소드에서 동일한 배열(객체)를 사용하도록 하고 싶은 경우 얕은복사를 이용한다.

		//인자와 매개변수로 활용
		print(names);
		
		//리턴값으로 활용
		String[] animals = getAnimals();
		
		//리턴받은 결과값도 출력
		System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());
		
		print(animals);
	}

	public static void print(String[] sarr) {
		
		//전달받은 배열의 hashcode 출력
		System.out.println("sarr의 hashcode : " + sarr.hashCode());
		
		//전달받은 배열의 값 출력
		for(int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
		System.out.println();
	}

	public static String[] getAnimals() {
		
		String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};
		
		//얕은복사 확인을 위해 hashcode 출력
		System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());
		
		return animals;
	}
}
