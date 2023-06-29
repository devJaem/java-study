package com.ohgiraffers.section06.singleton;

public class Application {

    public static void main(String[] args) {

        //싱글톤 패턴
        //애플리케이션이 시작될때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스 생성
        //하나의 인스턴스를 공유하여, 메모리 낭비를 방지

        //장점
        //1. 첫번째 이용시에는 인스턴스 생성시간이 걸려 속도차이가 없지만
        //   두번째 이용시에는 생성시간 없이 사용가능
        //2. 인스턴스가 절대적으로 한개만 존재하는것을 보증

        //단점
        //1. 인스턴스가 너무 많은일을 하거나 데이터를 공유하면 결합도가 높아짐
        //   (유지보수와 테스트가 어려움)
        //2. 동시성 문제를 고려하여 설계하기 때문에 난이도가 높음.

        //구현법
        //1. 이른 조기화 (Eager Initialization)
        //2. 게으른 초기화 (Lazy Initialization)

        //		EagerSingleton eager = new EagerSingleton();	//생성자가 private라 접근 불가

        //Eager 초기화 구현
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        //두 인스턴스의 hashcode가 동일
        System.out.println("eager1의 hashcode : " + eager1.hashCode());
        System.out.println("eager2의 hashcode : " + eager2.hashCode());

        //Lazy 초기화 구현
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        //두 인스턴스의 hashcode가 동일
        System.out.println("lazy1의 hashcode : " + lazy1.hashCode());
        System.out.println("lazy2의 hashcode : " + lazy2.hashCode());

    }
}
