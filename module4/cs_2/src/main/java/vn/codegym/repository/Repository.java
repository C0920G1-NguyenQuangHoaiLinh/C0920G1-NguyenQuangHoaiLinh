package vn.codegym.repository;

import java.util.List;

public interface Repository <T>{
    List<T> findAll();

    T findById(String id);

    void save(T model);

    void update(T model);

    void delete(T model);
}
