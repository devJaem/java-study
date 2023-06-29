package com.ohgiraffers.section03.dto;

public class MemberDTO {

    private int number;					//회원번호
    private String name;				//회원명
    private int age;					//나이
    private char gender;				//성별
    private double height;				//키
    private double weight;				//몸무게
    private boolean isActivated;		//회원탈퇴여부(활성화여부)

    //접근자 작성규칙
    //반환목적의 메소드 집합
    //하나의 접근자는 하나의 필드에만 접근
    //return을 이용하여 반환
    //반환과 반환타입 일치

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
