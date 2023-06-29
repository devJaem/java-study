package com.ohgiraffers.section02.functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Application4 {
    public static void main(String[] args) {
        //Operator 사용법
        //Operator : Function과 똑같이 applyXXX()메소드 차이점: 매개변수로 연산후 통일타입으로 리턴


        //BinaryOperator<T>#apply(T t1, T t2) : T : T와 T를 연산하여 T를 리턴한다.
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("hello", "world"));

        //UnaryOperator<T>#apply(T t) : T : T를 연산하여 T를 리턴한다.
        UnaryOperator<String> unaryOperator = (str) -> str + "world";
        System.out.println(unaryOperator.apply("hell"));

        //아래로는 자료형, 연산갯수만 달라짐
        //DoubleBinaryOperator#applyAsDouble(double d1, double d2) : double : 매개변수 두 개를 이용하여 연산 후 double 타입으로 리턴한다.

        //DoubleUnaryOperator#applyAsDouble(double d) : double : 매개변수 한 개를 이용하여 연산 후 double 타입으로 리턴한다.

        //IntBinaryOperator#applyAsInt(int i1, int i2) : int : 매개변수 두 개를 이용하여 연산 후 int 타입으로 리턴한다.

        //IntUnaryOperator#applyAsInt(int i) : int : 매개변수 한 개를 이용하여 연산 후 int 타입으로 리턴한다.

        //LongBinaryOperator#applyAsLong(long l1, long l2) : long : 매개변수 두 개를 이용하여 연산 후 long 타입으로 리턴한다.

        //LongUnaryOperator#applyAsLong(long l) : long : 매개변수 한 개를 이용하여 연산 후 long 타입으로 리턴한다.
    }
}
