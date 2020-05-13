package org.learn_java.data;

import java.util.List;

public interface Repository<T> {

    void add(T item);

    void update(T item);

    void remove(T item);

    List<T> getAll();

}