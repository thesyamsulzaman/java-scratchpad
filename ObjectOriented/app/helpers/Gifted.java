package app.helpers;

import java.lang.annotation.*;


@Target(value = { ElementType.TYPE, ElementType.METHOD })
@Retention( value = RetentionPolicy.RUNTIME )

public @interface Gifted {

  String name() default "";
  String[] types() default {};


}
