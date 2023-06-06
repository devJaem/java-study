package com.ohgiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {

        //기본생성자 호출하여 인스턴스 생성후 필드값 출력
        User user1 = new User();
        System.out.println(user1.getInformation());

        //매개변수 전달받는 생성자로 인스턴스 생성후 필드값 출력
        User user2 = new User("user01", "pass01", "홍길동");
        System.out.println(user2.getInformation());

        //기본생성자로 생성시, 운영체제 상의 날짜/시간 활용하여 인스턴스 생성
        User user3 = new User("user02", "pass02", "이순신", new java.util.Date());
        System.out.println(user3.getInformation());

        //복사생성자 User3과 동일한 필드값을 가지나, hash가 다름
        //user3의 필드값을 user4에 대입한 별개의 객체이기 때문
        User user4 = new User(user3);
        System.out.println(user4.getInformation());
    }
}
