package com.ohgiraffers.section04.constructor;

public class User {
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    //생성자의 작성위치
    //필드 선언부, 메소드 선언부 사이에 작성함

    //생성자의 사용목적
    //인스턴스 생성시점에 수행할 명령이 있는 경우
    //인스턴스를 생성할 목적에 주로 사용됨
    //생성자 외에는 생성방법이 제공되지 않음 ( 생성방법 제한할수 있음 : 초기값 전달 강제화)

    //this.필드명=매개변수; 가 주로 사용된다.
    //생성자는 클래스의 이름과 동일해야함
    //반환형 없음. (작성시 메소드로 인식됨)

    //1. 기본생성자 ( 컴파일러가 추가해주지만 작성도 가능함 )
    //2. 매개변수있는 생성자 (기본생성자 자동생성 되지 않음)

    //기본생성자
    public User(){
        System.out.println("기본생성자 호출");
    }
    //동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성할수 없음
    //오버로딩의 경우 매개변수의 갯수 따라 다름

    //오버로딩
    public User(String id, String pwd, String name){
        this.id=id;
        this.pwd=pwd;
        this.name=name;

        System.out.println("User 클래스의 id, pwd, name 초기화하는 생성자");
    }

    //id, pwd, name, enrolDate 초기화 생성자
    public User(String id, String pwd, String name, java.util.Date enrollDate){
        //기본방식
        //		this.id = id;
        //		this.pwd = pwd;
        //		this.name = name;
        //		this.enrollDate = enrollDate;

        //id, pwd, name 초기화 생성자를 활용한 생성자
        this(id, pwd, name);			//미리 작성한 세 개의 필드를 초기화 하는 생성자로 매개변수로 받은 값을 전달
        this.enrollDate = enrollDate;	//나머지 필드를 초기화

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    //복사 생성자
    public User(User otherUser){
        //기존에 작성된 생성자를 호출하여 초기화 this() 사용
        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
        System.out.println("User 클래스의 복사생성자 호출함...");

        //this의 주소와 otherUser 주소 비교
        System.out.println("this의 hashcode : " + this.hashCode());
        System.out.println("otherUser의 hashcode : " + otherUser.hashCode());
    }

    public String getInformation() {

        return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }
}
