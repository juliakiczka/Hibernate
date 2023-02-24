package org.example;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

    T create (T t) ;

    List<T> getAll() ;

    Optional<T> getById(int id) ;

    T update (T t) ;

    boolean removeById(int id);

    boolean removeAll();

}