package xyz.zzlabs.java.testjedi.ex01.impl;

import xyz.zzlabs.java.testjedi.ex01.CalculatorService;
import xyz.zzlabs.java.testjedi.ex01.NotImplementedException;

public class SimpleCalculatorService implements CalculatorService {

  @Override
  public int add(final int value1, final int value2) {
    return value1 + value2;
  }

  @Override
  public int subtract(final int n1, final int n2) {
    return n2 - n1;
  }

  @Override
  public int multiply(final int n1, final int n2) {
    return 0;
  }

  @Override
  public double divide(final int n1, final int n2) {
    throw new NotImplementedException();
  }

  @Override
  public double sqrt(final int n) {
    throw new NotImplementedException();
  }
}
