package xyz.zzlabs.java.testjedi.ex01.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import xyz.zzlabs.java.testjedi.ex01.HelloService;

class DefaultHelloServiceTest {

  private final HelloService hello = new DefaultHelloService();

  @Test
  void sayHelloTo() {
    assertEquals("Hello World!", hello.sayHelloTo("World"));
  }

  @Test
  void sayHelloToNull() {
    assertEquals("Hello Stranger!", hello.sayHelloTo(null));
  }

  @Test
  void sayHelloToFromPlace() {
    assertEquals("Hello World from Galaxy!", hello.sayHelloToFromPlace("World", "Galaxy"));
  }
}
