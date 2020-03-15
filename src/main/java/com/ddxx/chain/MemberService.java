package com.ddxx.chain;

public class MemberService implements IMemberService{

    @Override
    public void login(String loginName,String loginPass){
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        builder.build().doHandler(new Member(loginName,loginPass));
    }

}
