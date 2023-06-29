package com.ohgiraffers.section01.intenum;

public class Application { //열거패턴 Test

    public static void main(String[] args) {

        int subject1=Subjects.JAVA;
        int subject2=Subjects.HTML;
        //단순 상수 0 이기때문에 구분할 수 없음.
        if(subject1==subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }
        //실제 같은 과목이 아니지만 확인안됨
        //이름이 충돌하면 안되기 때문에 접두어를 사용해야함
        //상수 값을 문자열로 사용해야 하는경우 출력이 어려움

        int num=0;
        String subjectText="";

        switch (num){
            case Subjects.JAVA:subjectText="JAVA"; break;
            case Subjects.ORACLE:subjectText="ORACLE"; break;
            case Subjects.JDBC:subjectText="JDBC";break;
        }

        System.out.println("subjectText : "+ subjectText);

        printSubject(Subjects.ORACLE); //메소드를 새로 구성해야함
        printSubject(2); //대충 아무숫자나 넣어도 에러발생 안함
    }

    public static void printSubject(int subjectNumber){ //과목명 출력 메소드
        String subject="";

        switch(subjectNumber){
            case Subjects.JAVA:subject="JAVA"; break;
            case Subjects.ORACLE:subject="ORACLE"; break;
            case Subjects.JDBC:subject="JDBC"; break;
        }

        System.out.println("subject : "+subject);
    }
}
