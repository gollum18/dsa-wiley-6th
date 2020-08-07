package com.dsa.chp03.lists;

import com.dsa.chp02.classes.PredatoryCreditCard;

public class CircularlyLinkedList<E> implements IList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList(){}

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    @Override
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    @Override
    public void addFirst(E element) {
        if (isEmpty()) {
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(element, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        addFirst(element);
        tail = tail.getNext();
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    public E removeLast() {
        throw new UnsupportedOperationException();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }
}
