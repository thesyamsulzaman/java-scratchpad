package app.lib;

import java.lang.annotation.*;

@Target(value = { ElementType.TYPE, ElementType.METHOD });
@Retention(value = RetentionPolicy.RUNTIME);

public @interface Gifted {
  String talent;
  String[] backgrounds() default {};
}
