package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    //접근제한자 활용하기
    //public : 모든 패키지에서 접근가능
    //protected : 동일 패키지 에서만 접근 가능, 단 상속관계일 경우 다른패키지도 가능
    //default : 동일패키지에서만 접근 허용 (디폴드값이며 미작성시 적용)
    //private : 해당 클래스 내부에서만 접근가능

    //클래스의 맴버는 모든 접근제한자 활용가능
    //단 클래스 선언시는 public default 사용가능
    private String kinds;
    private int hp;

    public void setKinds(String kinds) {

        this.kinds = kinds;
    }

    public void setHp(int hp) {

        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {

        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }
}
