package ma.education.tp.annotations;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
@Inherited
public @interface Programmer {
    abstract int id();
    String name();
}
