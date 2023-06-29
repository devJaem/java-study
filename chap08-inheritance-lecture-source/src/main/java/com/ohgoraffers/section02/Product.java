package com.ohgoraffers.section02;

import java.util.Date;
public class Product {
    private String code; //제품코드
    private String brand; //제조사
    private String name; //제품명
    private int price;//가격
    private Date manufactuingDate; //자바 날짜 Util

    public  Product(){
        System.out.println("chap08.section02.Product 클래스의 기본생성자 호출");
    }
    public Product(String code, String brand, String name, int price, Date manufactuingDate){
        super(); //모든 클래스가 Object 클래스의 후손이기 때문에 정상동작

        this.code=code;
        this.brand=brand;
        this.name=name;
        this.price=price;
        this.manufactuingDate=manufactuingDate;

        System.out.println("chap08.section02.Product 클래스의 매개변수 있는 생성자를 호출");
    }
    public String getCode() {//get, set류 자동생성 이용 (private)
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufactuingDate() {
        return manufactuingDate;
    }
    public void setManufactuingDate(Date manufactuingDate) {
        this.manufactuingDate = manufactuingDate;
    }
    public String getInformation(){
        return "chap08.section02.Product [code="+code+", brand="+brand+", name="+name+", price="+price
                +", manufacturingDate="+manufactuingDate+"]";
    }
}


