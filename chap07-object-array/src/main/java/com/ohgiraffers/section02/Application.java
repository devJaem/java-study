package com.ohgiraffers.section02;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //객체배열을 활용하여 매개변수와 리턴값 사용하기

        //동일한 타입의 여러개의 인스턴스를 인자로 전달하거나 리턴받는경우에 객체배열 이용가능

        //요구사항
        //1. 여러명의 회원정보를 받아 한번에 여러 회원 정보 등록
        //2. 전체 회원 조회시 여러명 정보 반환

        //제약사항
        //MemberRepository에 stiatic 필드로 회원정보 관리
        //회원정보는 최대 10명

        Scanner sc = new Scanner(System.in);

        MemberService memberManager = new MemberService();

        while(true) {
            System.out.println("======== 회원 관리 프로그램 ========");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1 : memberManager.signUpMembers(); break;
                case 2 : memberManager.showAllMembers(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); return;
                default : System.out.println("잘못된 번호를 입력하셨습니다."); break;
            }
        }
    }
}
