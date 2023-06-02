package com.ohgiraffers.section01;

public class Application2 {
    public static void main(String[] args) {

        Animal[] animals=new Animal[5];//객체배열 생성
        animals[0]=new Rabbit();
        animals[1]=new Tiger();
        animals[2]=new Rabbit();
        animals[3]=new Tiger();
        animals[4]=new Rabbit();

        for(int i=0; i< animals.length; i++){
            animals[i].cry(); //i가 0에서 animals 배열의 끝까지 반복해서
            //animals[i].cry()를 호출
        }

        for(int i=0; i<animals.length; i++){
            if(animals[i] instanceof Rabbit){ //animal[i] 내부의 객체를 비교하여
                ((Rabbit) animals[i]).jump(); //형변환후 코드를 실행
            }else if(animals[i] instanceof Tiger){
                ((Tiger) animals[i]).bite();
            }else{
                System.out.println("호랑이나 토끼가 아닙니다."); //전부다 아닐경우
            }
        }
    }
}