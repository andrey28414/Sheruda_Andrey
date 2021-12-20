package com.tasks;

public class task3 {
        public static int digital_root(int number) {
            if (number < 10) {
                return number;
            } else {
                return digital_root(number % 10 + digital_root(number / 10));
            }
        }
}
