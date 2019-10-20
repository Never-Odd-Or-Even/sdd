package io.neveroddoreven.sdd.annotation;

import java.lang.annotation.*;

/**
 * Annotation to be used when you've lost the battle, but not the war. You've had to do something
 * that you don't like, and you're not keen on, and you'd rather not put our name to.
 *
 * This marker annotation however can be used to show to developers that come after you that
 * what they are seeing is not reflective of you as a developer, but rather reflective of a
 * culture that sometimes values dirty hacks and quick fixes over 'the right way'.
 *
 * There, but for the grace of God, go us.
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
public @interface PewPewPew {
    String why() default "";
}
