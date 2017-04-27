package com.xproject.pattern.state.elevator.second;

public class Context implements IElevator{
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

    @Override
    public void open() {
        state.open();
    }

    @Override
    public void close() {
        state.close();
    }

    @Override
    public void run() {
        state.run();
    }

    @Override
    public void stop() {
        state.stop();
    }

    @Override
    public void urgent() {
        state.urgent();
    }

    public static void main(String[] param) {
        Context context = new Context(new ELevator());
        context.close();
        context.run();
        context.open();
        context.urgent();
    }

}
