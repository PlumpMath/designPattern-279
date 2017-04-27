package com.xproject.pattern.state.elevator.first;

public class ClosedState extends State {

    public ClosedState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        context.getElevator().open();
        context.setState(context.openState);
    }

    @Override
    public void close() {
        log("closed", "close");
    }

    @Override
    public void run() {
        context.getElevator().run();
        context.setState(context.runningState);
    }

    @Override
    public void stop() {
        context.getElevator().stop();
        context.setState(context.stoppedState);
    }
}
