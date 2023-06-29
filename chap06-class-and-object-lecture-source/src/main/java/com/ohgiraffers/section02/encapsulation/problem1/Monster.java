package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    String name; //몬스터 이름
    int hp; //몬스터 체력

    //set 메소드를 이용하여 필드에 간접으로 접근하는 방법
    public void setHp(int hp){
        if(hp>0){
            System.out.println("양수값이 입력되어 몬스터의 체력을 설정합니다.");
            this.hp=hp;
            //this는 인스턴스가 생성될때 자신의 주소를 저장하는 변수
            //지역변수, 전역변수중 지역변수에 우선 접근되기 때문에
            //전역변수 접근시 this. 를 꼭 명시해 주어야 함
        }else{
            System.out.println("0보다 작거나 같으면 체력을 0으로 설정합니다.");
            this.hp=0;
        }
    }
}
