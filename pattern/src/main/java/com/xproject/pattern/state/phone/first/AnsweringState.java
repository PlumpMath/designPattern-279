package com.xproject.pattern.state.phone.first;

public class AnsweringState extends State {

    public AnsweringState(Context context) {
        super(context);
    }

    @Override
    public void dial() {
        log("answering", "dial");
    }

    @Override
    public void redial() {
        log("answering", "redial");
    }

    @Override
    public void handUp() {
        context.getIphone().handUp();
    }

    @Override
    public void answer() {
        log("answering", "answer");
    }
}
