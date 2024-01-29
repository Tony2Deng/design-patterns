package com.tony.behavior.visitor.visitor.impl;

import com.tony.behavior.visitor.part.impl.Computer;
import com.tony.behavior.visitor.part.impl.KeyBoard;
import com.tony.behavior.visitor.part.impl.Monitor;
import com.tony.behavior.visitor.part.impl.Mouse;
import com.tony.behavior.visitor.visitor.ComputerVisitor;

public class ComputerVisitorImpl implements ComputerVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("displaying" + computer.getName());
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("displaying monitor" + monitor.getName());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("displaying mouse" + mouse.getName());
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("displaying keyBoard" + keyBoard.getName());
    }
}
