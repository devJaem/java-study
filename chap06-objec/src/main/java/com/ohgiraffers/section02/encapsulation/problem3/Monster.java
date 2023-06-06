package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
    //name 변수를 사용할때
    //	String name;		//이거 먼저 작성
    //	int hp;

    //	public void setInfo(String info) {
    //
    //		this.name = name;
    //	}
    //
    //	public void setHp(int hp) {
    //
    //		if(hp > 0) {
    //			this.hp = hp;
    //		} else {
    //			this.hp = 0;
    //		}
    //	}
    //
    //	public String getInfo() {
    //
    //		return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    //	}

    //name을 kinds로 변경했을때
    String kinds;
    int hp;

    //set 메소드를 활용하여 맴버 접근시
    //name > kinds로 바뀌면 메소드만 수정하면
    //main 메소드에서 호출할때는 코드가 변경되지 않아도 사용가능하다.

    public void setInfo(String info) {

        this.kinds = info;
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
