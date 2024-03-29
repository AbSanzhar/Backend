package com.devglan.dao;

import com.devglan.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao extends CrudRepository<User, Integer> {



    User findByUsername(String username);


//    @Query(value = "select u from User u join u.department")
 //   List<User> findList();

}
