package org.uestc.suntao.dbtest.repos;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.uestc.suntao.dbtest.model.User;

public interface UserRepo extends CrudRepository<User, Serializable> {

}
