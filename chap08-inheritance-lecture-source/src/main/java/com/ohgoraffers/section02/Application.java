package com.ohgoraffers.section02;

public class Application {
    public static void main(String[] args) {
        Product product1= new Product();
        System.out.println(product1.getInformation()); // 기본값 초기화

        Product product2 = new Product("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new java.util.Date());
        System.out.println(product2.getInformation()); //객체변수 정보확인

        Computer computer1 = new Computer();
        System.out.println(computer1.getInformation());//기본값 초기화

        Computer computer2 = new Computer("퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer2.getInformation());//객체변수 정보확인

        Computer computer3 =
                new Computer("S-01234", "삼성", "갤럭시Z폴드2", 2398000, new java.util.Date()
                        , "퀼컴 스냅드래곤", 512, 12, "안드로이드");
        System.out.println(computer3.getInformation()); //부모필드와 함꼐 초기화후 정보확인
    }
}
