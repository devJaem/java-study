package com.ohgiraffers.section03.grammar;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        UserRole1 admin= UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());

        UserRole2 consumer=UserRole2.CONSUMER;
        System.out.println(consumer.ordinal()+ " "+consumer.name()+" "+consumer.getDescription());

        UserRole2 consumer2=UserRole2.CONSUMER;
        //최초 사용시에만 열거타입으로 생성하고 이후에는 생성자 호출하지 않음
        System.out.println(consumer==consumer2);
        //인스턴스가 싱글톤이기 때문에 비교연산 (==)으로 비교가 가능함

        System.out.println("==============================");

        //EnumSet의 활용
        //EnumSet은 abstact 키워드를 사용하므로 객체생성이 불가능함
        //아래와 같이 활용하여 열거형 타입을 세트로 취급함
        EnumSet<UserRole2> roles=EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter=roles.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().name());
        }
        //UserROle2의 열거형 타입을 while문을 이용하여 전부다 표출
        System.out.println("==============================");

        EnumSet<UserRole2> users= EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter=users.iterator();
        while(userIter.hasNext()){
            UserRole2 role= userIter.next();
            System.out.println(role.ordinal()+" "+role.getDescription());
        }
        //특정 상수만 골라서 세트에 추가
        //Consumer, Producer
        System.out.println("===============================");

        EnumSet<UserRole2> notGuest=EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> notGuestIter= notGuest.iterator();
        while(notGuestIter.hasNext()){
            UserRole2 role= notGuestIter.next();
            System.out.println(role.ordinal()+ " " + role.getDescription());
        }
        //특정 상수만 제외하여 세트에 추가
        //GUEST
    }
}
