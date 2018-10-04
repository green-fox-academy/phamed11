package com.greenfoxacademy.p2pchat.models;



import java.util.ArrayList;
import java.util.List;

public class LogList {

  private List<Log> allLogs;
  private int logCount;

  public LogList() {
    allLogs = new ArrayList<>();
  }


  public LogList(List<Log> allLogs, int logCount) {
    this.allLogs = allLogs;
    this.logCount = logCount;
  }

  public List<Log> getLogList() {
    return allLogs;
  }

  public void setLogList(List<Log> allLogs) {
    this.allLogs = allLogs;
  }

  public int getLogCount() {
    return logCount;
  }

  public void setLogCount(int logCount) {
    this.logCount = logCount;
  }

}
