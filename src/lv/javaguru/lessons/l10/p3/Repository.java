package lv.javaguru.lessons.l10.p3;

import java.util.List;
import java.util.Optional;

/**
 * @author Konstantins Buts on 2018-11-27.
 */
public interface Repository<T> {

    List<T> findAll();
    Optional<T> findById(String id);
    void add(T task);
    void remove(T task);

}
