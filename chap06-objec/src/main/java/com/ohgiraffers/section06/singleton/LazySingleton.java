package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    //클래스가 치기화 되는 시점에서는 정적 필드를 선언하고 null 초기화
    private static LazySingleton lazy;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        //인스턴스를 생성한 적이 없는 경우 인스턴스 생성해서 반환
        //생성한 인스턴스가 있는 경우 인스턴스 반환.

        if(lazy==null){
            lazy=new LazySingleton();
        }
        return lazy;
    }
}
