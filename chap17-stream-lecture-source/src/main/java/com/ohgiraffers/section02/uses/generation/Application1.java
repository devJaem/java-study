package com.ohgiraffers.section02.uses.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {

        //배열 스트림 생성, 사용하기
        String[] sarr= new String[] {"java", "oracle", "jdbc"};

        Stream<String> strStream1 = Arrays.stream(sarr);
        strStream1.forEach(System.out::println);

        Stream<String> strstream2 = Arrays.stream(sarr, 0, 2);
        strstream2.forEach(System.out::println);

        //컬렉션 스트림 생성
        List<String> stringList = Arrays.asList("html","css","javascript");

        Stream<String> strStream3= stringList.stream();
        strStream3.forEach(System.out::println);

        //컬렉션의 경우 스트림 생성을 생략하고 사용이 가능함
        stringList.forEach(System.out::println);

        //Builder를 활용한 스트림 생성
        //builder는 Static<T>로 되어있는 메소드이며, 호출시 타입파라미터를 아래와 같이 전달한다.
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();

        builderStream.forEach(System.out::println);

        //iterator()를 활용하여 수열 형태의 스트림을 생성 가능
        Stream<Integer> intStream=Stream.iterate(10, value -> value * 2).limit(10);
        intStream.forEach(value -> System.out.print(value + " "));
    }
}
