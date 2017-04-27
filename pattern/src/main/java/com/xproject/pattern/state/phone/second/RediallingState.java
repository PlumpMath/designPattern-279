package com.xproject.pattern.state.phone.second;

public class RediallingState extends State {

    public RediallingState(Context context) {
        super(context);
    }

    @Override
    public void dial() {
        context.getIphone().dial();
        context.setState(context.diallingState);
    }

    @Override
    public void redial() {
        log("redial", "redial");
    }

    @Override
    public void handUp() {
        context.getIphone().handUp();
        context.setState(context.freeState);
    }

    @Override
    public void answer() {
        context.getIphone().answer();
        context.setState(context.answeringState);
    }

    @Override
    public void urgent() {
        context.getIphone().urgent();
        context.setState(context.diallingState);
    }
}
