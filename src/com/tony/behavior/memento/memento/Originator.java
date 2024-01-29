package com.tony.behavior.memento.memento;

public class Originator {
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Memento saveStateToMemento() {
        return new Memento(status);
    }

    public void getStateFromMemento(Memento memento) {
        this.status = memento.getStatus();
    }
}
