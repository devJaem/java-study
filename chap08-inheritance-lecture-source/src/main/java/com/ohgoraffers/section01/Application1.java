package com.ohgoraffers.section01;

public class Application1 {

    public static void main(String[] args) {
        //상속
        Car car= new Car(); //자동차 객체 선언

        car.soundHorn();//출발전 경적
        car.run();//출발
        car.soundHorn();//출발후 경적
        car.stop();//정지
        car.soundHorn();//정지후 경적

        FireCar fireCar=new FireCar(); //소방차 객체 선언

        fireCar.soundHorn(); //출발전 경적
        fireCar.run(); //출발
        fireCar.soundHorn(); //출발후 경적
        fireCar.stop(); //정지
        fireCar.soundHorn(); //정지후 경적
        fireCar.sprayWater();//물뿌리기

        RacingCar racingCar= new RacingCar();

        racingCar.soundHorn();//울리지 않음
        racingCar.run();//달림
        racingCar.soundHorn(); //울리지 않음
        racingCar.stop();//정지
        racingCar.soundHorn(); //울리지 않음



    }
}
