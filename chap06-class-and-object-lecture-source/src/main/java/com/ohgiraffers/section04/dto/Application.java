package com.ohgiraffers.section04.dto;

public class Application {

    public static void main(String[] args) {

        //생성자와 설정자를 이용한 초기화

        //생성자를 활용하기
        //장점 :단 한번의 호출로 인스턴스 생성
        //단점 : 매개변수 갯수를 경우의 수 별로 모두 만들어야함
        //    : 인자가 많아지면 한눈에 알아보기 어려움
        UserDTO user1 = new UserDTO("ohgiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());
        System.out.println(user1.getInformation());

        //기본 생성자와 설정자를 활용하기
        //장점 :필드를 초기화할때 각각의 값이 어떤 필드를 초기화 하는지 명확함
        //단점 :하나의 인스턴스 생성시, 한번의 호출로 끝나지 않음.
        UserDTO user2 = new UserDTO();
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInformation());

    }
}
