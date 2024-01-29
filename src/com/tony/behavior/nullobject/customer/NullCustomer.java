package com.tony.behavior.nullobject.customer;

public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "not exist";
    }
}
