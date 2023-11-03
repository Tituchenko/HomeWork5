package org.example;

public class Filosof extends Thread{
    String name;
    volatile Fork leftFork,rightFork;
    int eatingTime=0;
    Boolean hasThinking=false;

    public Filosof(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        while (eatingTime<3) {
            thinking();
            eating();
        }
        System.out.println(name + " наелся");
    }
    private void thinking(){
        hasThinking=true;
        System.out.println(name + " думает");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private void eating(){
        if (!leftFork.getBusy() && !rightFork.getBusy() && hasThinking) {
            synchronized (leftFork) {
                synchronized (rightFork) {
                    leftFork.setBusy(true);
                    rightFork.setBusy(true);
                    hasThinking = false;
                    System.out.println(name + " ест");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    leftFork.setBusy(false);
                    rightFork.setBusy(false);
                    eatingTime++;
                }
            }
        }
    }
}
