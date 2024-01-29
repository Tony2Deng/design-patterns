package com.tony.behavior.iterator.contianer.impl;

import com.tony.behavior.iterator.contianer.Container;
import com.tony.behavior.iterator.contianer.Iterator;


public class NameRepository implements Container {
    public String[] names = {"Robert" , "John" ,"Julie" , "Lora", "Tony"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
