package com.ohgiraffers.section08.initblock;

public class Application {

    public static void main(String[] args) {

        //초기화블럭
        //복잡한 초기화를 수행할 수 있는 블럭을 제공
        //종류
        //1. 인스턴스 초기화 블럭
        //인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행
        //인스턴스를 호출하는 시점마다 호출
        //인스턴스 변수를 초기화하며 정적필드에는 실행시점마다 값을 덮어씀.
//        {
//            초기화 내용 작성
//        }

        //2. 정적 초기화 블럭
        //클래스가 로드될 때 한번 동작
        //정적 필드를 초기화 하며, 인스턴스변수는 초기화 하지 못함.(순서상 생성이 안되어있음)

//        static{
//            초기화 내용 작성
//        }

        //인스턴스 생성
        Product product = new Product();

        //1. 기본값 초기화 내용 확인
        //2. 명시적 초기화로 필드초기화 후 확인
        //3. 초기화블럭으로 필드 초기화 선언

        System.out.println(product.getInformation());


        //매개변수 있는 생성자를 이용한 초기화
        Product product2 = new Product("대륙폰", 300000, "샤우미");
        System.out.println(product2.getInformation());


        //순서정리
        //인스턴스 변수 : 기본값 > 명시적 초기값 > 인스턴스초기화블럭 > 생성자
        //클래스변수: 기본값> 명시적 초기값> 정적초기화 블럭>인스턴스 초기화 블럭> 생성자
    }
}
