package com.tony.behavior.memento;

import com.tony.behavior.memento.memento.CareTaker;
import com.tony.behavior.memento.memento.Originator;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setStatus("state1");
        originator.setStatus("state2");
        careTaker.add(originator.saveStateToMemento());
        originator.setStatus("state3");
        careTaker.add(originator.saveStateToMemento());
        originator.setStatus("state4");
        System.out.println("now state:" + originator.getStatus());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("old state1:" + originator.getStatus());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("old state2:" + originator.getStatus());
    }
}
