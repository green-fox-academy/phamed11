package com.greenfoxacademy.hellobeanworld;

import com.greenfoxacademy.hellobeanworld.Services.MyColor;
import com.greenfoxacademy.hellobeanworld.Services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  Printer printer;
  MyColor myColor;

  @Autowired
  public HellobeanworldApplication(Printer printer, MyColor myColor) {
    this.myColor = myColor;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("SOME SPRING INFO");
    printer.log("Hello");
    System.out.println("SOME SPRING INFO");
    printer.log(myColor.printColor());

  }

}
