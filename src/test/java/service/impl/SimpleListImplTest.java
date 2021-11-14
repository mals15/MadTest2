package service.impl;

import org.junit.Test;
import service.SimpleList;

import static org.junit.Assert.*;

public class SimpleListImplTest {

    String str1 = "one";
    String str2 = "two";
    String str3 = "three";
    String str4 = "four";
    String str5 = "five";
    String str6 = "six";

    SimpleList<String> listString = new SimpleListImpl<> ();
    SimpleList<String> newListString = new SimpleListImpl<> ();


    @Test
    public void add() {
        listString.add(str1);
        listString.add(str2);
        listString.add(str2);
        listString.add(str2);
        listString.add(str2);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str4);
        listString.add(str5);
        listString.add(str6);
        listString.add(str6);
        listString.add(str6);
        listString.add(str5);
        listString.add(str4);
        listString.add(str4);
        listString.add(str4);
        listString.add(str4);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str2);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        System.out.print(listString.size());
    }

    @Test
    public void insert() throws Exception {
        listString.insert(1, str1);
        listString.insert(2, str2);
        listString.insert(3, str3);
        listString.insert(4, str4);
        listString.insert(4, str5);
        listString.insert(3, str6);
        listString.insert(5, str3);
        listString.insert(6, str2);
        listString.insert(7, str1);
        listString.insert(8, str2);
        listString.insert(9, str5);
        listString.insert(10, str6);
        listString.insert(10, str5);
        listString.insert(11, str5);
        listString.insert(11, str4);
        listString.insert(12, str3);
        listString.insert(13, str6);
        listString.insert(12, str4);
    }

    @Test
    public void remove() throws Exception {
        listString.add(str1);
        listString.add(str2);
        listString.add(str2);
        listString.add(str2);
        listString.add(str2);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str4);
        listString.add(str5);
        listString.add(str6);
        listString.add(str6);
        listString.add(str6);
        listString.add(str5);
        listString.add(str4);
        listString.add(str4);
        listString.add(str4);
        listString.add(str4);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str2);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.remove(5);
        listString.remove(7);
        listString.remove(720);
    }

    @Test
    public void get() throws Exception {
        listString.insert(1, str1);
        listString.insert(2, str2);
        listString.insert(3, str3);
        listString.insert(4, str4);
        listString.insert(4, str5);
        listString.insert(3, str6);
        listString.insert(5, str3);
        listString.insert(6, str2);
        listString.insert(7, str1);
        listString.insert(8, str2);
        listString.insert(9, str5);
        listString.insert(10, str6);
        listString.insert(10, str5);
        listString.insert(11, str5);
        listString.insert(11, str4);
        listString.insert(12, str3);
        listString.insert(13, str6);
        listString.insert(12, str4);
        listString.get(3);
        listString.get(20);
        listString.get(500);
    }

    @Test
    public void size() {
    }

    @Test
    public void addAll() {
        listString.add(str1);
        listString.add(str2);
        listString.add(str2);
        listString.add(str2);
        listString.add(str2);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str4);
        listString.add(str5);
        listString.add(str6);
        listString.add(str6);
        listString.add(str6);
        listString.add(str5);
        listString.add(str4);
        listString.add(str4);
        listString.add(str4);
        listString.add(str4);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str3);
        listString.add(str2);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);
        listString.add(str1);

        newListString.add(str1);
        newListString.add(str2);
        newListString.add(str3);
        newListString.add(str4);
        newListString.add(str5);
        newListString.add(str6);
        newListString.add(str5);
        newListString.add(str3);
        newListString.add(str3);
        newListString.add(str2);
        newListString.add(str5);
        newListString.add(str6);

        listString.addAll(newListString);
    }

    @Test
    public void first() {
    }

    @Test
    public void last() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void shuffle() {
    }

    @Test
    public void sort() {
    }
}