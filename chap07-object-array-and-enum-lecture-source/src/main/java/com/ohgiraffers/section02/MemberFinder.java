package com.ohgiraffers.section02;

public class MemberFinder {

    public Member[] findAllMembers() {

        return MemberRepository.findAllMembers();
    }
}
