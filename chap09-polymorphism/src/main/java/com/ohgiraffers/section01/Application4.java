package com.ohgiraffers.section01;

public class Application4 {
    public static void main(String[] args) {

        Application4 app4= new Application4();

        Animal randomAnimal= app4.getRandomAnimal();
        randomAnimal.cry();
    }

    public  Animal getRandomAnimal(){ //랜덤한 정수 생성
        int random=(int)(Math.random()*2); //범위 0~1

        return random==0? new Rabbit(): new Tiger(); //random 변수에 저장된 수가 0일떄 Rabbit 객체 생성
        //             저장된 수가 1일때 Tiger 객체 생성
    }
}
