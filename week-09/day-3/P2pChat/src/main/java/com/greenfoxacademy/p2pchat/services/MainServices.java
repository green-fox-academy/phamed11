package com.greenfoxacademy.p2pchat.services;


import com.greenfoxacademy.p2pchat.models.Log;
import com.greenfoxacademy.p2pchat.models.User;

public interface MainServices {

  String printLog(Log log);
  void saveLog(Log log);
  void saveUser(User user);

}
