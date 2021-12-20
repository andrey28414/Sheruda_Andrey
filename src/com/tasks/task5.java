package com.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class task5 {
    static String sort_Guest_List(String input){
        String sorted_list = "";
        String[] full_names = input.split(";");
        ArrayList<String> unsorted_list = new ArrayList<String>();
        for (int i = 0; i < full_names.length; i++){
            if(full_names[i].length() >0){
                unsorted_list.add(full_names[i]);
            }
        }
        Collections.sort(unsorted_list);
        for (int j = 0; j < unsorted_list.size(); j++) {
            sorted_list+="("+unsorted_list.get(j)+")";
        }

        return sorted_list;
    }
}
