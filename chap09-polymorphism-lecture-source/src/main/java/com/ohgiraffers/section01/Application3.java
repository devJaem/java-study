package com.ohgiraffers.section01;

public class Application3 {
    public static void main(String[] args) {

        Application3 app3= new Application3(); //하단 feed 메소드 사용을 위해 객체생성

        Animal animal1= new Rabbit();
        Animal animal2= new Tiger();

        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3= new Rabbit(); //rabbit 객체 선언
        Tiger animal4= new Tiger(); //Tiger 객체 선언

        app3.feed((Animal) animal3); // 명시적 형변환
        app3.feed((Animal) animal4);

        app3.feed(animal3); //묵시적 형변환
        app3.feed(animal4);

        app3.feed(new Rabbit()); //인스턴스 생성후 바로 묵시적 형변환
        app3.feed(new Tiger());
    }


    public void feed(Animal animal){//먹이주기
        animal.eat();
    }
}
