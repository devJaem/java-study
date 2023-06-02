package com.ohgoraffers.section02;

import java.util.Date;
public class Computer extends Product{
    private String cpu; //cpu
    private int hdd; //hdd
    private int ram; //ram
    private String operationSystem; //운영체제

    public  Computer(){
        System.out.println("chap08.section02.Computer 클래스의 기본 생성자 호출함...");
    }
    public Computer(String cpu, int hdd, int ram, String operationSystem){
        super();//부모클래스 기본생성자 호출

        this.cpu=cpu;
        this.hdd=hdd;
        this.ram=ram;
        this.operationSystem=operationSystem;

        System.out.println("chap08.section02.Computer 클래스의 모든 필드를 초기화하는 생성자 호출함");
    }



    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem){

        super(code, brand, name, price, manufacturingDate);
        //부모의 필드를 초기화하는 생성자로 chap08.section02.Product 클래스가 가진 필드를 최적화 할 값을 전달함.

        this.cpu=cpu;
        this.hdd=hdd;
        this.ram=ram;
        this.operationSystem=operationSystem;

        System.out.println("chap08.section02.Computer 클래스의 부모 필드도 초기화하는 생성자 호출");
    }
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    @Override
    public String getInformation() {
//        		return "chap08.section02.Computer ["
//				+ "code=" + super.getCode()
//				+ ", brand=" + super.getBrand()
//				+ ", name=" + super.getName()
//				+ ", price=" + super.getPrice()
//				+ ", manufacturingDate=" + super.getManufacturingDate()
//				+ ", cpu=" + this.cpu
//				+ ", hdd=" + this.hdd
//				+ ", ram=" + this.ram
//				+ ", operationSystem=" + this.operationSystem
//				+ "]";
        //getter 함수이용한 합치기
        //super., this. 다 사용가능
        //가독성이 낮아 super 이용 권장

        return super.getInformation()//부모의 메소드 호출 super() 사용해야함!!!
                + "chap08.section02.Computer ["        //this.getInformation() 사용시 재귀호출 > 오버플로우
                + "cpu=" + this.cpu     //getInformation() 사용시도 this. 이 자동추가되어 재귀호출
                + ", hdd=" + this.hdd
                + ", ram=" + this.ram
                + ", operationSystem=" + this.operationSystem
                + "]";
    }
}

