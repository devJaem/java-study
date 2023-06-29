package com.ohgiraffers.section03.abstaction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //객체지향
        //현실세계의 모든 사건(event)는 객체와 객체의 상호작용에 의해 일어난다는 사실을 프로그램을 만들 때 이용하여 새로운 세계를 창조하는 방법론.
        //현실세계에서 불가능한 무생물이나 개념 같은 존재들도 하나의 주체로 본인의 상태를 스스로 제어하고 행동하도록 한다.(캡슐화)
        //모든 객체는 책임을 가지고 자신의 역할을 수행해야 한다.
        //또한 하나의 객체는 너무 많은 일을 수행하는 것이 아닌 적절한 책임을 가지고 있어야 한다.(단일책임)

        //추상화
        //공통된 부분을 추출하고 공통되지 않은 부분을 제거하여 유연성 확보
        //여러 곳에 적용될 수 있는 유연한 객체 > 재사용성 높음
        //중복 작성되는 코드를 줄일 수 있다.
        //오류 발생 가능성을 감소시키고 유지보수성을 증가시킨다.

        //객체와 객체의 상호작용
        //메세지를 주고 받음 (송신자와 수신자)
        //메세지를 받으면 내용을 처리하는 방법을 스스로 결정함, 그 결정한 방법대로 처리하는 과정을 메소드를 통한다,

        //카레이서 객체 생성
        CarRacer racer = new CarRacer();

        //카레이서의 행동을 입력받음
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("======== 카레이싱 프로그램 ==========");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch(no) {
                case 1 : racer.startUp(); break;
                case 2 : racer.stepAccelator(); break;
                case 3 : racer.stepBreak(); break;
                case 4 : racer.turnOff(); break;
                case 9 : System.out.println("프로그램을 종료합니다."); break;
                default : System.out.println("잘못된 번호를 선택하셨습니다."); break;
            }

            if(no == 9) {
                break;
            }
        }
    }
}

