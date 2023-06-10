package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {

		//배열을 사용하는 예시
		//값을 입력받음
		int[] scores = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		//배열 반복문으로 접근하기
		for(int i = 0; i < scores.length; i++) {

			System.out.print((i + 1) + "번 째 학생의 자바 점수를 입력해 주세요 : ");
			scores[i] = sc.nextInt();
		}
		
		//합계와 평균 변수 선언
		double sum = 0.0;
		double avg = 0.0;
		
		//배열값을 sum 변수에 누적
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		//합계에서 배열의 길이(갯수)를 나누어서 avg에 대입
		avg = sum / scores.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
