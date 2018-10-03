package com.greenfoxacademy.p2pchat.services;


import com.greenfoxacademy.p2pchat.models.Log;
import com.greenfoxacademy.p2pchat.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServicesImpl implements MainServices {

  private LogRepository logRepository;

  @Autowired
  public MainServicesImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }


  @Override
  public String printLog(Log log) {
    return log.toString();
  }

  @Override
  public void saveLog(Log log) {
    logRepository.save(log);
  }
}
