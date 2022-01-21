package xyz.zzlabs.java.testjedi.ex01.impl;

import xyz.zzlabs.java.testjedi.ex01.HelloService;
import xyz.zzlabs.java.testjedi.ex01.NotImplementedException;

public class DefaultHelloService implements HelloService {

  @Override
  public String sayHelloTo(final String subject) {
    return "Hello " + subject + "!";
  }

  @Override
  public String sayHelloToFromPlace(final String subject, final String place) {
    throw new NotImplementedException();
  }
}
