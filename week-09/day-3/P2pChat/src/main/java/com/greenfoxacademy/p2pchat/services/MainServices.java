package com.greenfoxacademy.p2pchat.services;


import com.greenfoxacademy.p2pchat.models.Log;
import com.greenfoxacademy.p2pchat.models.User;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface MainServices {

  String printLog(Log log);
  void saveLog(Log log);
  void saveUser(User user);
  List<User> getAllUsers();
  void createLog(HttpServletRequest request, String logLevel, String requestData);
}
