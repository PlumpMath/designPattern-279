package com.xproject.pattern.state.elevator.first;

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
}
