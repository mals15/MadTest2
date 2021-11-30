package service.impl;

import service.AdvancedList;
import service.SimpleList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SimpleListImpl<E> implements SimpleList<E>, AdvancedList<E> {

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
        if (this.count == this.size) {
            this.elements = resize(this.elements);
        }
        elements[count] = item;
        count++;
    }

    @Override
    public void insert(int index, E item) throws Exception {
        while (index > this.size) {
            this.elements=resize(this.elements);
        }
        for (int i=this.size; i!=index; i--) {
            if (i+1 > this.size){
                this.elements=resize(this.elements);
            }
            this.elements[i+1] = this.elements[i];
        }
        this.elements[index] = item;
        this.count++;
    }

    @Override
    public void remove(int index) throws Exception {
        try{
            for (int i=index; i < this.count-1; i++) {
                this.elements[i] = this.elements[i+1];
            }
            this.elements[this.count-1] = null;
            this.count--;
        } catch (Exception e) {
            System.out.println("Индекс находится за пределами массива!");
        }
    }

    @Override
    public Optional<E> get(int index) {
        if (index >=1 && index <= this.count) {
            return Optional.ofNullable(this.elements[index]);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public void addAll(SimpleList<E> list) {
        SimpleListImpl newSimpleListImpl = (SimpleListImpl) list;
        while (this.count + newSimpleListImpl.count >= this.size) {
            this.elements = resize(this.elements);
        }
        System.arraycopy(newSimpleListImpl.elements, 0, this.elements, this.count, newSimpleListImpl.count);
        this.count+=newSimpleListImpl.count;
    }

    @Override
    public int first(E item) {
        for (int i = 0; i < this.count; i++) {
            if (this.elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int last(E item) {
        for (int i=this.count; i > 0; i--) {
            if (this.elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E item) {
        for (int i=0; i<this.count; i++) {
            if( this.elements[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.count<1;
    }

    @Override
    public SimpleList shuffle() {

        return null;
    }

    @Override
    public SimpleList sort(Comparator comparator) {
        Arrays.stream(this.elements).sorted(comparator).toArray();
        return null;
    }

    private E[] resize (E[] elements) {
        this.size=this.size+10;
        E[] newElements = (E[]) new Object[this.size];
        for (int i=0; i<elements.length; i++) {
            newElements[i]=elements[i];
        }
        return newElements;
    }
}