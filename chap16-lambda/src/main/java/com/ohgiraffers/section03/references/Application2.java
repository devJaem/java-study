package com.ohgiraffers.section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        //생성자도 메소드 참조를 사용할수 있다.

        Function<String, Account> function = Account::new;

        Account account1 = function.apply("홍길동");
        Account account2 = function.apply("유관순");

        System.out.println(account1);
        System.out.println(account2);
    }
}
