package com.xproject.pattern.state.phone.first;

public abstract class State implements Iphone {
    protected final Context context;

    public State(Context context) {
        this.context = context;
    }

    protected void log(String state, String action) {
        System.out.println("phone can't take action " + action + " in state " + state);
    }
}
