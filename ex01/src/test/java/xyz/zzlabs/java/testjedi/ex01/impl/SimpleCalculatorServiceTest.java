package xyz.zzlabs.java.testjedi.ex01.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import xyz.zzlabs.java.testjedi.ex01.CalculatorService;

class SimpleCalculatorServiceTest {

  private final CalculatorService calculator = new SimpleCalculatorService();

  @Test
  void addTwoPositiveNumbers() {
    assertEquals(4, calculator.add(2, 2), "Unexpected sum");
  }

  @Test
  void subtract() {
    assertEquals(5, calculator.subtract(10, 5));
  }

  @Test
  void multiply() {
    assertEquals(8, calculator.multiply(4, 2));
  }

  @Test
  void divide() {
    assertEquals(4.0, calculator.divide(8, 2), 0.001);
  }

  @Test
  void divideByZero() {
    assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
  }

  @Test
  void sqrt() {
    assertEquals(2.0, calculator.sqrt(4), 0.001);
  }

  @Test
  void sqrtOfNegativeNumberThrowsArithmeticException() {
   assertThrows(ArithmeticException.class, () -> calculator.sqrt(-1));
  }
}
