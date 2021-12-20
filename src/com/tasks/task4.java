package com.tasks;

import java.util.List;

public class task4 {
    public static int pairs_type1(List<Integer> numbers, int targetValue) {
        int total = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == targetValue) {
                    total += 1;
                }
            }
        }

        return total;
    }

    public static int pairs_type2(List<Integer> numbers, int targetValue) {
        int total;

        total = numbers.stream()
                .map(number -> {
                    int pairs = (int) numbers.stream()
                            .filter(element -> targetValue - element == number).count();

                    if (targetValue - number == number) {
                        pairs -= 1;
                    }

                    return pairs;
                }).reduce(Integer::sum).orElse(0) / 2;

        return total;
    }

}
