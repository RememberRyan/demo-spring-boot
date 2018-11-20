package sda.ee.springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import sda.ee.springboot.dto.User;

/**
 * Created by Ryan Alexander on 20/11/2018.
 */

public interface UserRepository extends CrudRepository<User, Integer> {

}
