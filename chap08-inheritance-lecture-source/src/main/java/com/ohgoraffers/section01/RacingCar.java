package com.ohgoraffers.section01;

public class RacingCar extends Car{
    public RacingCar(){
        super();//생략가능
        //기본생성자 생성
    }
    public void run(){//override
        System.out.println("레이싱카가 전속력으로 질주합니다.!!!");
    }
    public void soundHorn(){ //override
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }
    public void stop(){
        System.out.println("레이싱카가 멈춥니다.");
    }

}
