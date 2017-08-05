package main.java.com.Alexandr.practice.modul08.task01;

import java.util.List;

/**
 * Created by admin on 05.08.2017.
 */
public class UserDAO extends AbstractDAOimp {
    private long id;
    private String name;

    public UserDAO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void save(Object o) {
        super.save(o);
    }

    @Override
    public void saveAll(List T) {
        super.saveAll(T);
    }

    @Override
    public void deleteById(long id) {
        list.remove(this.getId());
    }

   public long getId(){
        return id;
   }
}
