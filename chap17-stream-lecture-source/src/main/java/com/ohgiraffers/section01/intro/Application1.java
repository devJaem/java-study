package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {

    public static void main(String[] args) {

        //컬렉션에 저장된 엘리먼트들을 하나씩 순회하면서 처리가능
        //스트림을 사용하여 배열 혹은 컬렉션을 함수 여러개를 사용하여 결과를 얻을수 있음
        //람다식과도 함꼐 사용이 가능하고ㅡ 컬렉션에 들어있는 데이터에 대한 처리를 간결하게 표현할수 있음.
        //람다식을 활용해 코드양도 줄이고 간결하게 표현 가능
        //스트림은 내부 반복자를 사용하기 때문에 병렬처리가 쉽다.

        List<String> stringList = new ArrayList<>(Arrays.asList("hello","world","stream"));

        //이전방식
        System.out.println("============= foreach");
        for(String str : stringList){
            System.out.println(str);
        }

        //스트림 방식
        System.out.println("=============== stream");
        stringList.forEach(System.out::println);
    }
}
