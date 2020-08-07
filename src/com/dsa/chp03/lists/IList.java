package com.dsa.chp03.lists;

public interface IList<E> {

    public int size();
    public boolean isEmpty();
    public E first();
    public E last();
    public void addFirst(E element);
    public void addLast(E element);
    public E removeFirst();
    public E removeLast();

}
