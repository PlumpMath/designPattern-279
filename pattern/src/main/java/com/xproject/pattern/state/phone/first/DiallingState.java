package com.xproject.pattern.state.phone.first;

public class DiallingState extends State {

    public DiallingState(Context context) {
        super(context);
    }

    @Override
    public void dial() {
        log("dialling", "dial");
    }

    @Override
    public void redial() {
        context.getIphone().redial();
        context.setState(context.rediallingState);
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
}
