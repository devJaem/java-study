package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp(300);

        Monster monster4 = new Monster();
        monster4.setInfo("미이라");
        monster4.setHp(400);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        monster4.kinds = "두치";
        monster4.hp = -500;

        System.out.println("monster4 kinds : " + monster4.kinds);
        System.out.println("monster4 hp : " + monster4.hp);
        //name > kind 변경시에도 필드 접근은 잘 동작한다.
    }
}
