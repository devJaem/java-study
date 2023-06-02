package com.ohgoraffers.section01;

public class FireCar extends Car{
    //Car를 상속받는 자식클래스
    //부모의 private 접근불가

    public FireCar(){
        super(); //생성자에는 super() 자동 추가
        //부모의 기본생성자 호출

        System.out.println("FireCar 클래스의 기본생성자 호출됨...부모클래스 super() 사용");
    }
    @Override
    public void soundHorn() {
        if (isRunning()) {
            //사용조건
            //주행중 확인
            //private 변수에 접근불가 ex)protect 사용
            //this.isRunning() or super.isRunning() 사용가능
            //this가 default
            //super가 명시적일 경우도 존재하므로 지정해주는것이 좋음
            System.out.println("빠아아아아아앙~~~~~~~~~~~~~~~~~~~~~~");
        } else {
            System.out.println("소방차가 앞으로 갈수 없습니다 비키세요");
        }
    }
    public void sprayWater(){ //물뿌리기
        System.out.println("물을 뿌립니다.");
    }
}


