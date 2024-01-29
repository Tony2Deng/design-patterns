package com.tony.behavior.visitor.part;

import com.tony.behavior.visitor.visitor.ComputerVisitor;

public interface ComputerPart {
    void accept(ComputerVisitor computerVisitor);
}
