package com.tony.behavior.visitor.part.impl;

import com.tony.behavior.visitor.part.ComputerPart;
import com.tony.behavior.visitor.visitor.ComputerVisitor;

public class KeyBoard implements ComputerPart {
    private String name = "keyboard";

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
