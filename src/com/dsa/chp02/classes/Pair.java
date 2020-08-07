package com.dsa.chp02.classes;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A a, B b) {
        first = a;
        second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
