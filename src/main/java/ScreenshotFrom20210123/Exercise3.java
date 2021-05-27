package ScreenshotFrom20210123;

import java.util.HashSet;
import java.util.Set;

public class Exercise3 {
    public static void main(String[] args) {
        Set<IntPair> intPairsSet = new HashSet<>();
        intPairsSet.add(new IntPair(1,2));
        intPairsSet.add(new IntPair(2,1));
        intPairsSet.add(new IntPair(1,1));
        intPairsSet.add(new IntPair(1,2));

        for (IntPair intPair : intPairsSet) {
            System.out.println(intPair.getA() + " " + intPair.getB());
        }

    }
}
