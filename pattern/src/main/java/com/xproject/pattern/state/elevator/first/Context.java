package com.xproject.pattern.state.elevator.first;

public class Context {
    /*package*/ final State openState = new OpenState(this);
    /*package*/ final State closedState = new ClosedState(this);
    /*package*/ final State runningState = new RunningState(this);
    /*package*/ final State stoppedState = new StoppedState(this);

    /*package*/ final IElevator elevator;

    private State state;

    public Context(IElevator elevator) {
        this.elevator = elevator;
        this.state = openState;
    }

    public IElevator getElevator() {
        return elevator;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void open() {
        state.open();
    }

    public void close() {
        state.close();
    }

    public void run() {
        state.run();
    }

    public void stop() {
        state.stop();
    }

    public static void main(String[] param) {
        Context context = new Context(new Elevator());
        context.close();
        context.run();
        context.open();
    }

}
