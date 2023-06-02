package com.ohgoraffers.section01;

public class Car {
    private  boolean runningStatus; //달리기 상태 확인필드

    public Car() { //기본 생성자 호출
        System.out.println("Car 클래스의 기본 생성자 호출");
    }
    public void run(){ //출발
        runningStatus=true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn(){//경적울리기
        //조건, 주행중에만 기능 수행 가능
        if(isRunning()){
            System.out.println("빵!빵!");
        }else{
            System.out.println("주행중이 아닙니다.");
        }
    }
    protected boolean isRunning(){ //주행상태확인
        return runningStatus;
    }
    public void stop(){//정지
        runningStatus=false;
        System.out.println("자동차가 멈춥니다.");
    }

}

