package com.xproject.pattern.state.phone.second;

public class AndroidPhone implements Iphone {
    @Override
    public void dial() {
        System.out.println("dial the phone");
    }

    @Override
    public void redial() {
        System.out.println("redial the phone");
    }

    @Override
    public void handUp() {
        System.out.println("handUp the phone");
    }

    @Override
    public void answer() {
        System.out.println("answer the phone");
    }

    @Override
    public void urgent() {
        System.out.println("call 911");
    }
}
