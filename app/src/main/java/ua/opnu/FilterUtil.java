package ua.opnu;

import java.util.*;
import java.util.function.Predicate;

public class FilterUtil {
    public static <T> T[] filter(T[] input, Predicate<T> predicate) {
        return Arrays.stream(input)
                .filter(predicate)
                .toArray(size -> Arrays.copyOf(input, size));
    }
}
