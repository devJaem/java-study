package com.ohgiraffers.section03.copy;

public class Application4 {

	public static void main(String[] args) {


		//깊은복사 예제
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1.clone();
		
		//각 배열의 인덱스에 10씩 누적 증가 시킴
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;
		}
		
		//반복문을 이용한 값 출력
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");		//정상적으로 10씩 증가된 값을 가지고 있다.
		}
		System.out.println();
		

		 //향상된 for문 : jdk 1.5 버젼부터 추가되었다.
		 //배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행한다.

		//값에 10씩 값을 누적시켜서 확인
		for(int i : arr2) {
			i += 10;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");		//증가되지 않고 있다. 인덱스에 접근해서 값을 변경한게 아니고 꺼낸 값을 복사해서 쓴 것이다.
		}
		System.out.println();
		
		//향상된 for문은 배열에 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수는 없다.
		//대신 변경하는 것이 아니고 사용하는 것이 목적이라면 조금 더 편하게 사용할 수 있다.

		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
