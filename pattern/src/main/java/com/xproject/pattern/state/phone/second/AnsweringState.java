package com.xproject.pattern.state.phone.second;

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

    @Override
    public void urgent() {
        context.getIphone().urgent();
        context.setState(context.diallingState);
    }
}
