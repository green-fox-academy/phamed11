package com.greenfoxacademy.p2pchat.services;


import com.greenfoxacademy.p2pchat.models.Log;

public interface MainServices {

  String printLog(Log log);
  void saveLog(Log log);

}
