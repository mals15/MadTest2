package service;

import java.util.Comparator;
import java.util.Optional;

public interface SimpleList <E> {

    void add(E item);
    void insert(int index, E item) throws Exception;
    void remove(int index) throws Exception;
    Optional<E> get(int index);
    int size();
    void addAll(SimpleList<E> list);
    int first(E item);
    int last(E item);
    boolean contains(E item);
    boolean isEmpty();
    SimpleList<E> suffle();
    SimpleList<E> sotr(Comparator<E> comparator);
}
