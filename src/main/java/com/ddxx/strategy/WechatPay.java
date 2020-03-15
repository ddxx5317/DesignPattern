package com.ddxx.strategy;

/**
 * Created by Tom.
 */
public class WechatPay extends Payment {

    public String getName() {
        return "微信支付";
    }

    protected double queryBalance(String uid) {
        return 256;
    }

}
