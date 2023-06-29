package com.ohgiraffers.section03.dto;

public class Application {

    public static void main(String[] args) {
        //데이터 추상화
        //모든 필드를 private로 직접 접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다.
        //private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성된다.
        //주로 계층간 데이터를 주고 받을 목적으로 사용한다.

        //객체 생성
        MemberDTO member = new MemberDTO();

        //접근자를 이용한 값 입력
        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(180.5);
        member.setWeight(80.6);
        member.setActivated(true);

        //확인출력
        System.out.println("회원번호 : " + member.getNumber());
        System.out.println("회원명 : " + member.getName());
        System.out.println("나이 : " + member.getAge());
        System.out.println("성별 : " + member.getGender());
        System.out.println("키 : " + member.getHeight());
        System.out.println("몸무게 : " + member.getWeight());
        System.out.println("회원활성화상태 : " + member.isActivated());
    }
}
