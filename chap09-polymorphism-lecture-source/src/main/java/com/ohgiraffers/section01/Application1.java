package com.ohgiraffers.section01;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("chap09.section01.Animal 객체 생성");
        Animal animal=new Animal();
        animal.eat();
        animal.run();
        animal.eat();

        System.out.println("Rabit 객체 생성");
        Rabbit rabit=new Rabbit();
        rabit.eat();
        rabit.run();
        rabit.cry();
        rabit.jump();

        System.out.println("chap09.section01.Tiger 객체 생성");
        Tiger tiger=new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println("애니멀 타입으로 래빗, 타이거 인스턴스 주소값 저장");
        Animal a1= new Rabbit(); // chap09.section01.Rabbit r = new chap09.section01.Animal(); 부모가 자식 인스턴스를 가저올순 없음
        Animal a2= new Tiger(); //chap09.section01.Tiger t = new chap09.section01.Animal(); 부모가 자식 인스턴스를 가저올순 없음

        System.out.println("동적바인딩 확인");
        a1.cry(); //Animal로 연결되어 있지만 동작시 Rabbit으로 동작함
        a2.cry(); //Animal로 연결되어 있지만 동작시 Tiger로 동작함

        System.out.println("클래스타입 형변환 확인 --------------------------");
        ((Rabbit) a1).jump();
        ((Tiger) a2).bite();
    }
}

