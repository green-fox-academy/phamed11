package com.greenfoxacademy.connectionmysql.services;

import com.greenfoxacademy.connectionmysql.models.Assignee;

import java.util.List;

public interface AssigneeServices {

  List<Assignee> findAllAssignees();
  void deleteAssigneeById(Long id);
  Assignee findAssigneeById(Long id);
  void saveAssignee(Assignee assignee);
}
