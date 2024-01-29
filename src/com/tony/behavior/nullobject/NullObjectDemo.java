package com.tony.behavior.nullobject;

import com.tony.behavior.nullobject.customer.AbstractCustomer;
import com.tony.behavior.nullobject.factory.CustomerFactory;

public class NullObjectDemo {
    public static void main(String[] args) {
        AbstractCustomer tony = CustomerFactory.getCustomer("Tony");
        AbstractCustomer bob = CustomerFactory.getCustomer("Bob");
        AbstractCustomer james = CustomerFactory.getCustomer("james");
        AbstractCustomer jack = CustomerFactory.getCustomer("jack");

        System.out.println(tony.getName());
        System.out.println(bob.getName());
        System.out.println(james.getName());
        System.out.println(jack.getName());
    }
}
