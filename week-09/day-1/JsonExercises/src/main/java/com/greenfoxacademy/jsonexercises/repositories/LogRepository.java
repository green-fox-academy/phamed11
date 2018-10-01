package com.greenfoxacademy.jsonexercises.repositories;

import com.greenfoxacademy.jsonexercises.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {

  List<Log> findAll();

}
