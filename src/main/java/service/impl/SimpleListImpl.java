package service.impl;

import service.SimpleList;

import java.util.Comparator;
import java.util.Optional;

public class SimpleListImpl<E> implements SimpleList<E> {

    private int count;
    private int size;
    private E[] elements;

    public SimpleListImpl() {
        count = 0;
        size = 10;
        elements = (E[]) new Object[size];
    }

    @Override
    public void add(E item) {
        if (count == size) {
            elements = resize(elements);
        }
        elements[count] = item;
        count++;
    }

    @Override
    public void insert(int index, E item) throws Exception {
        while (index > size) {
            elements=resize(elements);
        }
        for (int i=size; i!=index; i--) {
            if (i+1 > size){
                elements=resize(elements);
            }
            elements[i+1]=elements[i];
        }
        elements[index] = item;
        count++;
    }

    @Override
    public void remove(int index) throws Exception {
        try{
            for (int i=index; i < count-1; i++) {
                elements[i] = elements[i+1];
            }
            elements[count-1] = null;
            count--;
        } catch (Exception e) {
            System.out.println("Индекс находитс за пределами массива!");
        }
    }

    @Override
    public Optional<E> get(int index) {
        if (index >=1 && index <= count) {
            return Optional.ofNullable(elements[index]);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void addAll(SimpleList<E> list) {
        SimpleListImpl newSimpleListImpl = (SimpleListImpl) list;
        while (count + newSimpleListImpl.count >= size) {
            elements = resize(elements);
        }
        System.arraycopy(newSimpleListImpl.elements, 0, this.elements, count, newSimpleListImpl.count);
        count+=newSimpleListImpl.count;
    }

    @Override
    public int first(E item) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int last(E item) {
        for (int i=count; i > 0; i--) {
            if (elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E item) {
        for (int i=0; i<count; i++) {
            if( elements[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count<1;
    }

    @Override
    public SimpleList shuffle() {
        return null;
    }

    @Override
    public SimpleList sort(Comparator comparator) {
        return null;
    }

    private E[] resize (E[] elements) {
        size=size+10;
        E[] newElements = (E[]) new Object[size];
        for (int i=0; i<elements.length; i++) {
            newElements[i]=elements[i];
        }
        return newElements;
    }
}