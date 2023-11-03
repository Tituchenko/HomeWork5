package org.example;

public class Fork {
    private String name;
    private Boolean isBusy=false;

    public Fork(String name) {
        this.name = name;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }
}
