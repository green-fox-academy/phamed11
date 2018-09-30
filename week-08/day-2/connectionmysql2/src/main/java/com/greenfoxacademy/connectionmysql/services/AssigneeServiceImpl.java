package com.greenfoxacademy.connectionmysql.services;

import com.greenfoxacademy.connectionmysql.models.Assignee;
import com.greenfoxacademy.connectionmysql.respositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeServices {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }


  @Override
  public List<Assignee> findAllAssignees() {
    return assigneeRepository.findAll();
  }

  @Override
  public void deleteAssigneeById(Long id) {
    assigneeRepository.deleteById(id);
  }

  @Override
  public Assignee findAssigneeById(Long id) {
    return assigneeRepository.findById(id).get();
  }

  @Override
  public void saveAssignee(Assignee assignee) {
    assigneeRepository.save(assignee);
  }
}
