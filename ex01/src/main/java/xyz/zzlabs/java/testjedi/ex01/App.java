package xyz.zzlabs.java.testjedi.ex01;

import xyz.zzlabs.java.testjedi.ex01.impl.DefaultHelloService;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    System.out.println(new DefaultHelloService().sayHelloTo("world"));
  }
}
