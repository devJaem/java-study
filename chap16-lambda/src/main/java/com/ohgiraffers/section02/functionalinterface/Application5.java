package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Application5 {
    public static void main(String[] args) {
        //Predicate 사용법
        //Predicate : 매개변수와 boolean 값을 반환하는 testXXX() 메소드 (매개변수 활용하여 boolean 반환)

        // Supplier<T>#get() : T : 객체 T를 리턴한다.
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        System.out.println(supplier.get());

        //BooleanSupplier#getAsBoolean() : boolean : boolean값을 리턴한다.
        BooleanSupplier booleanSupplier = () -> {
            int random = (int) (Math.random() * 2);
            return random == 0? false: true;
        };
        System.out.println("랜덤 true or false : " + booleanSupplier.getAsBoolean());

        //IntSupplier#getAsInt() : int : int값을 리턴한다
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        System.out.println("주사위를 던져서 나온 수 : " + intSupplier.getAsInt());

        //DoubleSupplier#getAsDouble() : double : double값을 리턴한다.
        DoubleSupplier doubleSupplier = () -> Math.random();
        System.out.println("Math.random()의 리턴값 : " + doubleSupplier.getAsDouble());

        //LongSupplier#getAsBoolean() : long : long값을 리턴한다.
        LongSupplier longSupplier = () -> new java.util.Date().getTime();
        System.out.println("1970년 1월 1일 0시 0분 0초 이후 지난 시간 : " + longSupplier.getAsLong());
    }
}
