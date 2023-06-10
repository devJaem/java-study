package com.ohgiraffers.section01.thread;

public class Application {
    public static void main(String[] args) {

        //프로세스(process) : 실행중인 프로그램, 프로그램을 운영체제의 메모리와 CPU를 할당받아 실행되는 단위
        //쓰레드(thread) : 프로세스 내에서 실제로 작업을 수행하는 주체

        //모든 프로세스는 하나이상의 쓰레드를 가진다.
        //두개 이상의 쓰레드를 가지면 멀티 쓰레드.
        //자바는 멀티쓰레드 환경을 제공함!

        //Thread 클래스 상속받는법
        //Runnable 인터페이스 상속받는법

//    Car car=new Car();
//    Tank tank=new Tank();
//    Plane plane=new Plane();

        Thread t1= new Car();
        Thread t2=new Tank();
        Thread t3=new Thread(new Plane());
        //객체 > 쓰레드로 선언
//        t1.run();
//        t2.run();
//        t3.run();

        t1.start();
        t2.start();
        t3.start();
        //메인이 먼저 종료된후, 개별적으로 동작하는 주체로 만든뒤(쓰레드)
        //동시에 일하는것처럼 번갈아 가면서 수행
        //모든 쓰레드가 종료되어야 프로세스가 종료됨.

        System.out.println("main이 종료됨...");
    }
}
