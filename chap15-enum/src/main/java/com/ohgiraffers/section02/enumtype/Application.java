package com.ohgiraffers.section02.enumtype;


public class Application {

    public static void main(String[] args) {

        Subjects subject1= Subjects.JAVA;
        Subjects subject2= Subjects.HTML;

        if(subject1==subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }else{
            System.out.println("두 과목은 다른 과목입니다.");
        }

        System.out.println(subject1==subject2.JAVA);
        //==연산도 가능함

        //접두사 대신 쓸수있는 네임스페이스 적용

        //public enum Backend { JAVA, ORACLE, JDBC, JAVASCRIPT }
        //public enum Frontend { HTML, CSS, JAVASCRIPT }

        System.out.println(Subjects.JAVA.toString());
        //문자열로 변경하여 출력 가능

        Subjects[] subjects=Subjects.values();
        for(Subjects s: subjects){
            System.out.println(s);
        }//values()와 객체배열을 사용하여 연속처리가 가능함


        printSubject(Subjects.HTML);
//        printSubject(2); //인스턴스는 정수사용하는경우 타입불이리 (컴파일 에러)
    }

    public static void printSubject(Subjects subjects){
        System.out.println(subjects.toString());
    }
}
