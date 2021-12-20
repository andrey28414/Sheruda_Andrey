package com.tasks;

import java.util.ArrayList;
import java.util.List;

public class task1 {

    public static List<Integer> get_only_int(List<Object> a) {
        List<Integer> t = new ArrayList<>();

        for (Object element : a) {
            if (element instanceof Integer) {
                t.add((Integer) element);
            }
        }

        return t;
    }
}