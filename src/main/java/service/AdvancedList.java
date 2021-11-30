package service;

import java.util.Comparator;

public interface AdvancedList<E>  {

    SimpleList<E> shuffle();
    SimpleList<E> sort(Comparator<E> comparator);
}
