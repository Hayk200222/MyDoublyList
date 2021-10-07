package com.company;

public class MydoublyLinkedList implements MyList {
    Node first;
    Node last;


    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void add(Object obj) {
        Node newNode = new Node(obj);
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        last.next = newNode;
        newNode.pervous = last;
        last = newNode;


    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }
}

class Node<T> {
    T value;
    Node next;
    Node pervous;

    public Node(T value) {
        this.value = value;
    }
}
