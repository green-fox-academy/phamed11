package com.greenfoxacademy.p2pchat;

import com.greenfoxacademy.p2pchat.services.MainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P2pchatApplication implements CommandLineRunner {

  private MainServices mainServices;

  @Autowired
  public P2pchatApplication(MainServices mainServices) {
    this.mainServices = mainServices;
  }

  public static void main(String[] args) {
    SpringApplication.run(P2pchatApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
