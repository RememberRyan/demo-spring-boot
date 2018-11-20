package sda.ee.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import sda.ee.springboot.dto.User;

/**
 * Created by Ryan Alexander on 20/11/2018.
 */

// this is a Bean because it extends CrudRepository
public interface UserRepository extends CrudRepository<User, Integer> {

    /* new request query. Spring parses 'findAllByName',
    name is property of user. Spring creates the SQL query from this line.
     */
    Iterable<User> findAllByName(String name);
}
