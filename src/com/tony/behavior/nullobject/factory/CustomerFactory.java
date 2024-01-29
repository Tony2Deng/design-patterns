package com.tony.behavior.nullobject.factory;


import com.tony.behavior.nullobject.customer.AbstractCustomer;
import com.tony.behavior.nullobject.customer.NullCustomer;
import com.tony.behavior.nullobject.customer.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Tony", "Bob", "James"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
