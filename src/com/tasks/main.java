package com.tasks;

import java.util.Arrays;

import static com.tasks.task1.get_only_int;
import static com.tasks.task2.first_non_repeating_letter;
import static com.tasks.task3.digital_root;
import static com.tasks.task4.*;
import static com.tasks.task5.sort_Guest_List;

public class main {
    public static void main(String[] args) {
        System.out.println("Task1:");
        System.out.println(get_only_int(Arrays.asList(8,9,10,'z','x','c')));
        System.out.println("Task2:");
        System.out.println(first_non_repeating_letter("sdhseddxzz"));
        System.out.println("Task3:");
        System.out.println(digital_root(123));
        System.out.println("Task4.1:");
        System.out.println(pairs_type1(Arrays.asList(8,9,10,1,2,3,4,5,6,3,2,1), 5));
        System.out.println("Task4.2:");
        System.out.println(pairs_type2(Arrays.asList(8,9,10,1,2,3,4,5,6,3,2,1), 5));
        System.out.println("Task5:");
        System.out.println(sort_Guest_List("Fired:Corwill;Wilfred:Corwill;Barney:TornBull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }

}
