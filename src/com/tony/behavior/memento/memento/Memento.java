package com.tony.behavior.memento.memento;

public class Memento {
    private String status;

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
