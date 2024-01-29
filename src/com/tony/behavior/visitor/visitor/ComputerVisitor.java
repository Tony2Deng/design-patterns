package com.tony.behavior.visitor.visitor;

import com.tony.behavior.visitor.part.impl.Computer;
import com.tony.behavior.visitor.part.impl.KeyBoard;
import com.tony.behavior.visitor.part.impl.Monitor;
import com.tony.behavior.visitor.part.impl.Mouse;

public interface ComputerVisitor {
    void visit(Computer computer);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(KeyBoard keyBoard);
}
