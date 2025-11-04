package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public boolean addItem(T items) {
        if (this.items.size() >= maxSize) {
            return false;
        }
        else {
            this.items.add(items);
            return true;
        }
    }

    public List<T> getItems() {
        return this.items;
    }
}
