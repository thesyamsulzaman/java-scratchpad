package app.utils;

import app.exceptions.ValidationException;


public class Validator {

  public static void validate(int input) throws ValidationException {
    if ( input == 0 ) {
      throw new ValidationException("this field is required");
    }
  }

}
