package com.company;

import java.util.Arrays;

class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    int getSize() {
        return size;
    }

    void addLastElement(E element) {
        ensureCapacity(size);
        elements[size] = element;
        size++;
    }

    void add(int index, E element) {
        ensureCapacity(size);
        if (index <= elements.length - 1) {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        } else {
            elements[index] = element;
            size++;
        }
    }

    void remove(int index) {
        if (index >= 0 && index < elements.length - 1) {
            for (int i = index - 1; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length - 1] = null;
            size--;
        } else {
        }
    }

    E get(int index) {
        if (index >= 0 && index <= elements.length - 1) {
            return elements[index];
        } else {
            return null;
        }
    }

    void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private void ensureCapacity(int size) {
        if (size > elements.length) {
            int newSize = 2 * elements.length + 1;
            elements = Arrays.copyOf(elements, newSize);
        }
    }
}