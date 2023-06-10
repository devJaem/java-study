package com.ohgiraffers.section04.sort;

public class Application4 {

	public static void main(String[] args) {
		
		//버블정렬
		
		//초기 배열 선언 및 초기화 */
		int[] iarr = {2,5,4,6,1,3};
		
		int temp;
		
		for(int i = iarr.length - 1; i >= 0; i--){
			for(int j = 0; j < i; j++) {
				
				if(iarr[j] > iarr[j + 1]) {
					
					temp = iarr[j];
					iarr[j] = iarr[j + 1];
					iarr[j+1] = temp;
				}
			}
		}
		
		//값 출력용 반복문
		for(int i = 0; i < iarr.length; i++){
			System.out.print(iarr[i] + " ");
		}
	}
}
