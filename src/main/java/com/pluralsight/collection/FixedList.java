package com.pluralsight.collection;

import java.util.List;

public class FixedList<T> {
    private Object[] items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new Object[maxSize];
        this.maxSize = maxSize;
    }

    public boolean addItem(T items) {
        if (Object[T] >= maxSize) {
            return false;
        }
        Object[maxSize] = items;
        items++;
        return true;
    }

    public Object[] getItems() {
        return items;
    }
}
