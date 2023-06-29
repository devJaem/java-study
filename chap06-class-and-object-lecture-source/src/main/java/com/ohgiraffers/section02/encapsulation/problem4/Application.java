package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        Monster monster1 = new Monster(); //객체생성
        //monster1.kinds = "프랑켄슈타인";		//private 접근 불가 (동일클래스 아님)
        //monster1.hp = 200;					//private 접근 불가 (동일클래스 아님)

        //public 메소드를 활용한 간접 접근법
        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        //위의 과정을 캡슐화 라고 한다.
        //특별한 목적이 없으면 캡슐화 적용이 원칙
    }
}
