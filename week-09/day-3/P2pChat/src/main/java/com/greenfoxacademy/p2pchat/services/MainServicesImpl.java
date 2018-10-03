package com.greenfoxacademy.p2pchat.services;


import com.greenfoxacademy.p2pchat.models.Log;
import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.repositories.LogRepository;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServicesImpl implements MainServices {

  private LogRepository logRepository;
  private UserRepository userRepository;

  @Autowired
  public MainServicesImpl(LogRepository logRepository, UserRepository userRepository) {
    this.logRepository = logRepository;
    this.userRepository = userRepository;
  }

  @Override
  public String printLog(Log log) {
    return log.toString();
  }

  @Override
  public void saveLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public void saveUser(User user) {
    userRepository.save(user);
  }
}
