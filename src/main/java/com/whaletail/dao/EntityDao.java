package com.whaletail.dao;

/**
 * @author Whaletail
 */
public interface EntityDao<T> {
    void add(T t);
    void update(T t);
    T getById(long id);
    void delete(T t);
}
