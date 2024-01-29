package com.tony.behavior.iterator;

import com.tony.behavior.iterator.contianer.Iterator;
import com.tony.behavior.iterator.contianer.impl.NameRepository;

public class IteratorDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
