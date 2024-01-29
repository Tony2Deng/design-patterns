package com.tony.behavior.visitor.part.impl;

import com.tony.behavior.visitor.part.ComputerPart;
import com.tony.behavior.visitor.visitor.ComputerVisitor;

public class Computer implements ComputerPart {
    ComputerPart[] parts;

    private String name = "computer";

    public Computer() {
        parts = new ComputerPart[] {new Monitor(), new KeyBoard(), new Mouse()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerVisitor);
        }
        computerVisitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
