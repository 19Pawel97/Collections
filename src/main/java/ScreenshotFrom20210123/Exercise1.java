package ScreenshotFrom20210123;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{10, 12, 10, 3, 4, 12, 12, 300, 12, 40, 5};
        Set<Integer> numbersSet = new HashSet<>(Arrays.asList(numbers));

        System.out.println("Size: " + numbersSet.size());

        for (Integer number:
             numbersSet) {
            System.out.println(number);
        }

        // removing 10L won't work - long is removed, Integer stays
        numbersSet.remove(10L);
        numbersSet.remove(12);
        System.out.println();

        // the name of a set + alt + Enter -> iterate = auto foreach
        for (Integer integer : numbersSet) {
            System.out.println(integer);
        }

    }
}
