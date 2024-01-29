package com.tony.behavior.visitor;

import com.tony.behavior.visitor.part.impl.Computer;
import com.tony.behavior.visitor.part.impl.Monitor;
import com.tony.behavior.visitor.visitor.impl.ComputerVisitorImpl;

public class VisitorDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerVisitorImpl());
        Monitor monitor = new Monitor();
        monitor.accept(new ComputerVisitorImpl());
    }
}
