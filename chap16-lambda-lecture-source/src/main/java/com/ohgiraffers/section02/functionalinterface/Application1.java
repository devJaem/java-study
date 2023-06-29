package com.ohgiraffers.section02.functionalinterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class Application1 {
    public static void main(String[] args) {


        //빈번하게 사용되는 함수적 인터페이스를 API로 제공
        //Consumer 사용법
        //Consumer : 리턴값이 없는 accept() 메소드 (매개변수 소비자)


        //Consumer<T>#accept(T t) : void : 객체 T를 받아 소비
        Consumer<String> consumer= str -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("hello World");

        //BiConsumer<T, U>#accept(T t, U u) : void : 객체 T, U를 받아 소비한다.
        BiConsumer<String, LocalTime> biConsumer = (str1, time) -> System.out.println(str1+"이(가)"+time+"에 입력됨.");
        biConsumer.accept("hello world", LocalTime.now());

        //IntConsumer#accept(int value) : void : int 값을 받아 소비한다.
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수는" +num +"입니다.");
        intConsumer.accept(12345);

        //ObjIntConsumer<T>#accept(T t, int value) : void : 객체 T와 int 값을 받아 소비한다.
        ObjIntConsumer<java.util.Random> objIntConsumer=
                (random, bound) -> System.out.println("0 부터"+bound+"전 까지의 난수 발생 : "+random.nextInt(bound));
        objIntConsumer.accept(new java.util.Random(),10);

        //ObjLongConsumer<T>#accept(T t, long value) : void : 객체 T와 long 값을 받아 소비한다.
        ObjLongConsumer<LocalDate> objLongConsumer=
                (date, days) -> System.out.println(date+"의 "+ days+"일 후의 날짜는 : "+date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        //ObjDoubleConsumer<T>#accept(T t, Double value) : void : 객체 T와 double 값을 받아 소비한다.
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
    }
}
