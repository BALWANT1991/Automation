package Exceptions;

import Exceptions.Throws.InvalidAgeException;

public class UserValidatorCustom {

  public void validateAge(int age) throws InvalidAgeException {
    if (age < 0) {
      //throw new IllegalArgumentException
      //("Age cannot be negative");
      throw new InvalidAgeException("Age cannot be negative");
    }
    System.out.println("Age is valid");
  }
}
