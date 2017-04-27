package com.xproject.pattern.state.elevator.second;

public abstract class State implements IElevator {

    protected final Context context;

    public State(Context context) {
        this.context = context;
    }

    protected void log(String state, String action) {
        System.out.println("Elevator can't take action " + action + " in state " + state);
    }
}
