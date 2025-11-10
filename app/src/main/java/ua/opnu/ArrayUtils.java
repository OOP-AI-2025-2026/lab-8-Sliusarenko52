package ua.opnu;

public class ArrayUtils {
    public static <T extends Comparable<? super T>, V extends T> boolean contains(T[] array, V element) {
        for (T el : array) {
            if (el.compareTo(element) == 0) return true;
        }
        return false;
    }
}
