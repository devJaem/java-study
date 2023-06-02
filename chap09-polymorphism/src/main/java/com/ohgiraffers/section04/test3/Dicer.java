package com.ohgiraffers.section04.test3;

public class Dicer {
    private int curruntPostition;

    public void ThrowDice(Dice dice){
        int diceNumber=dice.getNumber();
        move(diceNumber);
    }

    private void move(int diceNumber){
        this.curruntPostition +=diceNumber;
    }
}
