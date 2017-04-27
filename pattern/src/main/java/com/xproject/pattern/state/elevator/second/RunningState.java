package com.xproject.pattern.state.elevator.second;

public class RunningState extends State {

    public RunningState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        log("running", "open");
    }

    @Override
    public void close() {
        log("running", "close");
    }

    @Override
    public void run() {
        log("running", "run");
    }

    @Override
    public void stop() {
        context.getElevator().stop();
    }

    @Override
    public void urgent() {
        context.getElevator().urgent();
        stop();
        context.getElevator().open();
        context.setState(context.openState);
    }
}
