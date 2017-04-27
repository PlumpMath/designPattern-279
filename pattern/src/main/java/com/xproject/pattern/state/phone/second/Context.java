package com.xproject.pattern.state.phone.second;

public class Context implements Iphone {

    private final Iphone iphone;

    /*package*/ State freeState = new FreeState(this);
    /*package*/ State diallingState = new DiallingState(this);
    /*package*/ State rediallingState = new RediallingState(this);
    /*package*/ State answeringState = new AnsweringState(this);

    private State state;

    public Context(Iphone iphone) {
        this.iphone = iphone;
        this.state = freeState;
    }

    public Iphone getIphone() {
        return iphone;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void dial() {
        state.dial();
    }

    @Override
    public void redial() {
        state.redial();
    }

    @Override
    public void handUp() {
        state.handUp();
    }

    @Override
    public void answer() {
        state.answer();
    }

    @Override
    public void urgent() {
        state.urgent();
    }

    public static void main(String[] param) {
        Context context = new Context(new AndroidPhone());
        context.dial();
        context.redial();
        context.redial();
        context.answer();
        context.dial();
        context.urgent(); 
    }
}
