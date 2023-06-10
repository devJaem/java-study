package com.ohgiraffers.section04.sort;

public class Application2 {

	public static void main(String[] args) {
		
		//순차정렬
		//배열 선언 및 초기화
		int[] iarr = {2,5,4,6,1,3};
		
		//인덱스 한 개씩 증가시키는 반복문
		//첫 번째 인덱스는 비교할 필요 없어서 1번 인덱스부터 비교 시작

		for(int i = 1; i < iarr.length; i++){
			
			//인덱스가 증가할 때 마다 처음부터 해당 인덱스까지 값을 비교하는 반복문 */
			for(int j = 0; j < i; j++){
				
				//오름차순 정렬을 위한 처리
				//내림차순은 부등호만 반대로 처리하면 됨
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}

			}
		}
		
		//값 출력용 반복문
		for(int i = 0; i < iarr.length; i++){
			System.out.print(iarr[i] + " ");
		}
		
	}
}
