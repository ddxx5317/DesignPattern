package com.ddxx.chain;

public class Test {
    public static void main(String[] args) {
        IMemberService memberService = new MemberService();

        memberService.login("tom","6660");
    }
}
