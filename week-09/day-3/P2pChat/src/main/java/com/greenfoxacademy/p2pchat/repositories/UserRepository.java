package com.greenfoxacademy.p2pchat.repositories;

import com.greenfoxacademy.p2pchat.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
