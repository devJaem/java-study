package com.ohgiraffers.section01.array;

public class Application1 {

	public static void main(String[] args) {

		//배열과 일반 변수의 차이점
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;


		int sum = 0;
		
		//반복문 사용시 불편함
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		System.out.println("sum : " + sum);
		
		//사용방법
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//반복문 이용편리
		for(int i = 0, value = 0; i < arr.length; i++){
			arr[i] = value += 10;
		}

		int sum2 = 0;
		

		sum2 += arr[0];
		sum2 += arr[1];
		sum2 += arr[2];
		sum2 += arr[3];
		sum2 += arr[4];
		
		System.out.println("sum2 : " + sum2);
		
		//누적값 변수
		int sum3 = 0;
		
		//누적시킬때에도 반복문 사용 가능
		for(int i = 0; i < arr.length; i++){
			sum3 += arr[i];
		}
		
		System.out.println("sum3 : " + sum3);
	}
}
