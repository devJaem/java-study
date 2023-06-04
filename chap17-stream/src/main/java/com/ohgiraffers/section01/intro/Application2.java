package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        //스트림의 병렬처리
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "oracle", "jdbc", "html", "css"));

        //스트림 미사용시 모든 작업은 main 쓰레드에서 발생
        System.out.println("================foreach");
        for(String s: stringList){
            System.out.println(s+" : "+Thread.currentThread().getName());
        }

        for(String s: stringList){
            System.out.println(s+" : "+Thread.currentThread().getName());
        }

        //일반적인 스트림도 main 쓰레드
        System.out.println("=================nomal stream");
        stringList.forEach(Application2::print);
        stringList.forEach(Application2::print);

        //병렬 스트림인 경우에도 손쉽게 병렬처리 가능
        System.out.println("================= poralle stream");
        stringList.parallelStream().forEach(Application2::print);
        stringList.parallelStream().forEach(Application2::print);
    }

    private static void print(String str){
        System.out.println(str+ " : " + Thread.currentThread().getName());
    }
}
