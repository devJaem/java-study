package com.ohgiraffers.section04.dto;

public class UserDTO {

    //자바빈 JAVA BEAN
    //표준액션태그로 접근가능한 자바 클래스
    //자바 코드를 몰라도 사용할수 있도록 태그 형식으로 지원하는 문법
    //특정 목적에 따라 클래스를 작성하는 규칙 으로 볼수 있음

    //규칙
    //1. 특정 패키지에 속해야함
    //2. 접근제어자는 private로 선언되어야함
    //3. 기본생성자 명시적 존재 (매개변수는 선택사항)
    //4. 모든 맴버변수의 getter, setter가 public으로 작성되어야 함
    //5. 직렬화 (Serializable)가 되어야 함 (선택사항)

    //모든필드 private
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    //추후 매개변수 있는 생성자 추가시 에러 발생 방지를 위한 기본생성자
    public UserDTO() {}

    //선택사항 매개변수 생성자
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrollDate(java.util.Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    //getter
    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getEnrollDate() {
        return enrollDate;
    }

    //리턴값 메소드
    public String getInformation() {
        return "UserDTO [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }
}
