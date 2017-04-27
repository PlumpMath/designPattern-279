package com.xproject.pattern.state.phone.second;

public class FreeState extends State {

    public FreeState(Context context) {
        super(context);
    }

    @Override
    public void dial() {
        context.getIphone().dial();
        context.setState(context.diallingState);
    }

    @Override
    public void redial() {
        log("free", "redial");
    }

    @Override
    public void handUp() {
        log("free", "handup");
    }

    @Override
    public void answer() {
        log("free", "answer");
    }

    @Override
    public void urgent() {
        context.getIphone().urgent();
        context.setState(context.diallingState);
    }
}
