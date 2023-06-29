package com.ohgiraffers.section01;

public class Application {

    public static void main(String[] args) {

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티베이론", 400);
        Car car5 = new Car("포터", 500);
        //객체 생성

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        car4.driveMaxSpeed();
        car5.driveMaxSpeed();
        //객체를 통한 메소드 호출

        Car[] carArray = new Car[5];
        //객체 배열 사용
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티베이론", 400);
        carArray[4] = new Car("포터", 500);
        //각 인덱스별 인스턴스 생성

        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }
        //객체배열 + 반복문 이용한 메소드 호출

        Car[] carArray2 = {
                new Car("페라리", 300)
                , new Car("람보르기니", 350)
                , new Car("롤스로이스", 250)
                , new Car("부가티베이론", 400)
                , new Car("포터", 500)
        };
        //객체배열 할당과 동시에 초기화

        for(Car c : carArray2) {
            c.driveMaxSpeed();
        }
        //향상된 for 문 사용가능
    }
}
