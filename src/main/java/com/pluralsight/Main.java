package com.pluralsight;

import com.pluralsight.collection.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.addItem(10);
        numbers.addItem(20);
        numbers.addItem(30);
        numbers.addItem(40); // should fail here because maxSize is 3

        System.out.println(numbers.getItems());
        System.out.println(numbers.getItems().size());

        System.out.println();

        FixedList<LocalDate> localDate = new FixedList<>(2);
        localDate.addItem(LocalDate.now());
        localDate.addItem(LocalDate.now());
        //localDate.addItem(15); // will fail because this is an int, not LocalDate

        System.out.println(localDate.getItems());
        System.out.println(localDate.getItems().size());


    }
}
