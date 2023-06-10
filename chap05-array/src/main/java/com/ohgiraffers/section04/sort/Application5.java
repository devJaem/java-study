package com.ohgiraffers.section04.sort;

public class Application5 {

	public static void main(String[] args) {
		
		//삽입정렬
		
		//초기 배열 선언 및 초기화
		int[] iarr = {2,5,4,6,1,3};
		
		int temp;
		int j = 0;
		
		for(int i = 1; i < iarr.length; i++) {
			
			temp = iarr[i];
			
			for(j = i - 1; j >= 0 && temp < iarr[j]; j--) {
				iarr[j+1] = iarr[j];
			}
			
			iarr[j+1] = temp;
		}
		
		//값 출력용 반복문 */
		for(int i = 0; i < iarr.length; i++){
			System.out.print(iarr[i] + " ");
		}
	}
}
