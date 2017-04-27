package com.xproject.pattern.state.elevator.second;

public class OpenState extends State {

    public OpenState(Context context) {
        super(context);
    }

    @Override
    public void open() {
        log("open", "open");
    }

    @Override
    public void close() {
        context.getElevator().close();
        context.setState(context.closedState);
    }

    @Override
    public void run() {
        log("open", "run");
    }

    @Override
    public void stop() {
        log("open", "stop");
    }

    @Override
    public void urgent() {
        context.getElevator().urgent();
    }
}
