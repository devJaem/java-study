package com.ohgiraffers.section08.initblock;

public class Product {

    //필드를 초기화 하지않으면 JVM이 정한 기본값으로 객체 생성됨
    //	private String name;
    //	private int price;
    //	private static String brand;

    //명시적 초기화
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    //인스턴스 초기화블럭
    {
        name = "사이언";
        price = 900000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함...");

        //초기화 블럭은 static 필드를 초기화 할수 있는것 처럼 보임.
        //static 초기화 블럭은 클래스가 로드될때 이미 기본값 초기화가 진행.
        //인스턴스 초기화 블럭이 동작하는 시점에는 이미 초기화 진행된 정적필드에
        //인스턴스 초기화 블럭에서대입한 값으로 덮어쓰는것.
    }

    //정적 초기화 블럭
    static {
        //static 초기화 블럭에서는 non-static필드를 초기화하지 못함.
        //정적 초기화 블럭은 클래스 로드시 동작한다.
        //정적 초기화 블럭의 동작시, 인스턴스가 아무것도 존재하지 않음.
        //존재하지 않는 인스턴스 변수를 초기화 할수 없음.

        //name = "아이뽕";
        //price = 1000000;

        brand = "헬지";
        System.out.println("정적 초기화 블럭 동작함...");
    }

    //기본생성자
    public Product() {
        System.out.println("기본 생성자 호출됨...");
    }

    //매개변수가 있는 생성자
    //위에서 초기화된 값을 전부 무시후, 생성자에 작성한 초기화 내용으로 변수 초기화

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 있는 생성자 호출됨...");
    }

    //필드값 문자열 합처서 반환하는 메소드
    public String getInformation() {

        return "Product [name=" + this.name + ", price=" + this.price + ",brand=" + Product.brand + "]";
    }
}
