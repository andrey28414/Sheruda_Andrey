package com.tasks;

public class task2 {
    public static Character first_non_repeating_letter(String str) {
        char[] arr = str.toCharArray();
        int tmp;
        for (int i = 0; i < arr.length; i++){
            tmp=0;
            for(int j = 0; j < arr.length; j++){
                if (arr[i]==arr[j] && i!=j) tmp++;
            }
            if (tmp==0 && arr[i]!=' ') return arr[i];
        }
        return null;
    }

}
