package service.impl;

import service.SimpleList;

import java.util.Comparator;
import java.util.Optional;

public class SimpleListImpl<E> implements SimpleList<E> {

    int count;
    int razm;
    Object massive [];

    public SimpleListImpl() {
        count = 0;
        razm = 5;
        massive = new Object[razm];
    }

    @Override
    public void add(E item) {
        if (count == razm) {
            razm = razm*2;
            Object [] massive1 = new Object [razm];
            System.arraycopy(massive, 0, massive1, 0, razm/2);
            massive = massive1;
        }
        massive[count] = item;
        count++;
    }

    @Override
    public void insert(int index, E item) throws Exception {
        if (count++ >= razm) {
            razm = razm*2;
            Object [] massive1 = new Object [razm];
            System.arraycopy(massive, 0, massive1, 0, razm/2);
            massive = massive1;
        }
        massive[index] = item;
    }

    @Override
    public void remove(int index) throws Exception {
        if (index>razm) {
            System.out.println ("Индекс элемента для удаления находится за пределами массива!");
        }
        massive[index] = null;
        for (int i=index; i < count-1; i++) {
            massive[i] = massive[i+1];
        }
        massive[count-1] = null;
        count--;
    }
    @Override

    public Optional get(int index) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void addAll(SimpleList list) {

    }

    @Override
    public int first(E item) {
        for (int i = 0; i < count; i++) {
            if (massive[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int last(E item) {
        for (int i=count; i > 0; i--) {
            if (massive[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E item) {
        for (int i=0; i<count; i++) {
            if( massive[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public SimpleList suffle() {
        return null;
    }

    @Override
    public SimpleList sotr(Comparator comparator) {
        return null;
    }
}
