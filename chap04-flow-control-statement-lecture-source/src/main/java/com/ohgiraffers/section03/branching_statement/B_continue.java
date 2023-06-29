package com.ohgiraffers.section03.branching_statement;

public class B_continue {
	public void testSimpleContinueStatement() {
		
		/*
		 * continue문은 반복문 내에서 사용한다.
		 * 해당 반복문의 반복 회차를 중간에 멈추고 다음 단계(다시 증감식)으로 넘어가게 해준다.(for문의 경우)
		 * 일반적으로 if(조건식) { continue; }처럼 사용된다.
		 * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
		 */
		
		/* 1부터 100 사이의 4의 배수이면서 5의 배수인 값 출력(4와 5의 공배수) */
		for(int i = 1; i <= 100; i++) {
			if(!(i % 4 == 0 && i % 5 == 0)) {
				continue;
			}
			System.out.println(i);
		}
	}
}






