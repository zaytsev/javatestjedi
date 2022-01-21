package xyz.zzlabs.java.testjedi.ex01;

public interface CalculatorService {

  /**
   * Sums two numbers
   *
   * @param value1
   * @param value2
   *
   * @return sum of two numbers
   */
  int add(int value1, int value2);

  /**
   * Subtract value of <code>n2</code> from <code>n1</code>
   *
   * @param n1
   * @param n2
   *
   * @return result of (n1 - n2)
   */
  int subtract(int n1, int n2);

  int multiply(int n1, int n2);

  double divide(int n1, int n2);

  double sqrt(int n);
}
