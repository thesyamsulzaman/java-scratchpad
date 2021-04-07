package app.utils;

import app.exceptions.ValidationException;
import app.helpers.NotBlank;
import java.lang.reflect.Field;


public class Validator {

  //public static void validate(int input) throws ValidationException {
    //if ( input == 0 ) {
      //throw new ValidationException("this field is required");
    //}
  //}

  public static void validate(Object input) {
    Class inputClass = input.getClass();
    Field[] fields = inputClass.getDeclaredFields();

    for( Field field : fields ) {
      field.setAccessible(true);

      if (field.getAnnotation(NotBlank.class) != null) {

        try {
          String value = ( String ) field.get(input);
          if ( value == null ) {
            //throw new ValidationException("Field " + field.getName() + " tidak boleh kosong");
            System.out.println("Field " + field.getName() + " tidak boleh kosong");
          }
        } catch(IllegalAccessException err) {
          System.out.println("Tidak bisa melihat field " + field.getName());
        }

      }
    }

  }

}
