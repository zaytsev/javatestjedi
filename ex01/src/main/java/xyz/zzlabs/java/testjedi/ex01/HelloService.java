package xyz.zzlabs.java.testjedi.ex01;

public interface HelloService {

  /**
   * Creates a greeting
   *
   * @param subject greeting subject
   *
   * @return string containing a greeting formatted as "Hello xxxxx". <code>null</code> subject replaced with <code>"Stranger"</code>
   */
  String sayHelloTo(String subject);

  /**
   * Greets <code>subject</code> coming from <code>place</code>
   *
   * @param subject
   * @param place
   *
   * @return
   */
  String sayHelloToFromPlace(String subject, String place);
}
