package ScreenshotFrom20210123;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
public class IntPair {
    private int a;
    private int b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntPair intPair = (IntPair) o;
        return a == intPair.a && b == intPair.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
