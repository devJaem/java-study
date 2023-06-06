package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        //1번 몬스터 생성후, 이름 체력 적용하기
        Monster monster1 = new Monster();
        monster1.name = "두치";
        monster1.hp = 200;
        //1번 몬스터의 정보 표출하기
        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        //2번 몬스터 생성후 이름,체력적용하기 (if문 추가전)
        Monster monster2 = new Monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;
        //2번 몬스터의 정보 표출하기
        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);

        //3번 몬스터 생성 set 메소드 활용하기
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);
        //3번 몬스터의 정보 표출하기
        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);

        //4번 몬스터 생성, 음수입력 제한 확인하기
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);
        //4번 몬스터 정보 표출하기
        System.out.println("monster4 name : " + monster4.name);
        System.out.println("monster4 hp : " + monster4.hp);


    }
}
