package com.ohgiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {

        //여러가지 묶여있는 정보들으 처리하기위해 사용할수 있는 객체

        //기존 변수이용
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.print("hobby : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        //단점 변수명을 각각 관리해야함
        //회원이 여러명일경우 너무많은 변수가 필요함.
        //리턴값이 1개이기때문에 회원정보를 묶어서 리턴할수 없음. (서로다른 자료형)

        //서로다른 자료형의 데이타를 사용자 정의로 묶어서 사용 - 객체사용
        //Member 클래스 활용
        //자료형 변수명= new 클래스명(); -객체생성구문
        //new 연산자를 사용하여 heap에 할당함
        //Member클레스에 작성한대로 heap에 공간을 할당하여 생성하게된다
        Member member = new Member();

        //변수명.필드명 으로 접근하여 사용하는법
        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);

        //필드에 직접 접근하여 변수처럼 사용하기
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] {"축구", "볼링", "테니스"};

        //정보 변경후 변경값 확인하기
        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd : " + member.pwd);
        System.out.println("변경 후 member.name : " + member.name);
        System.out.println("변경 후 member.age : " + member.age);
        System.out.println("변경 후 member.gender : " + member.gender);
        System.out.print("변경 후 member.hobby : ");
        for(int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }
        System.out.println();


    }
}
