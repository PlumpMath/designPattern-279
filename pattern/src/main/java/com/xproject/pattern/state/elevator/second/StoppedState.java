package com.xproject.pattern.state.elevator.second;

public class StoppedState extends State {

    public StoppedState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        context.getElevator().open();
        context.setState(context.openState);
    }

    @Override
    public void close() {
        log("stopped", "close");
    }

    @Override
    public void run() {
        context.getElevator().run();
        context.setState(context.runningState);
    }

    @Override
    public void stop() {
        log("stopped", "stop");
    }

    @Override
    public void urgent() {
        context.getElevator().urgent();
        open();
    }
}
