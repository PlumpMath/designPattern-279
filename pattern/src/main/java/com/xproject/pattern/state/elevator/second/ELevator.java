package com.xproject.pattern.state.elevator.second;

public class ELevator implements IElevator {

    @Override
    public void open() {
        System.out.println("open the elevator");
    }

    @Override
    public void close() {
        System.out.println("close the elevator");
    }

    @Override
    public void run() {
        System.out.println("run the elevator");
    }

    @Override
    public void stop() {
        System.out.println("stop the elevator");
    }

    @Override
    public void urgent() {
        System.out.println("call 9-11");
    }
}
