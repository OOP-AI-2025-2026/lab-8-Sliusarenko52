package ua.opnu;

public class GenericThreeTuple<T, V, S> {
    public final GenericTwoTuple<T, V> pair;
    public final S third;

    public GenericThreeTuple(T first, V second, S third) {
        this.pair = new GenericTwoTuple<>(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + pair.first + ", " + pair.second + ", " + third + ")";
    }
}
