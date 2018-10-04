package com.greenfoxacademy.p2pchat.repositories;

import com.greenfoxacademy.p2pchat.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

 List<Log> findAll();
}
