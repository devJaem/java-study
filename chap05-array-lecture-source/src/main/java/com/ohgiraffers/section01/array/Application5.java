package com.ohgiraffers.section01.array;

public class Application5 {

	public static void main(String[] args) {

		//카드의 모양, 숫자 변수
		String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
		String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
		
		//난수발생 배열의 0~배열의 길이까지
		//모양, 숫자 각각 1개씩
		int randomShapeIndex = (int) (Math.random() * shapes.length);
		int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);
		
		//출력
		System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + " 카드 입니다.");
	}
}
