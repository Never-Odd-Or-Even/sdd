package io.neveroddoreven.sdd.annotation;

import java.lang.annotation.*;

/**
 * Annotation to be used when you have to do something horrible, or in such a horrible way, or
 * for such a horrible reason, that you immediately wish it would just die in a fire.
 *
 * Set this marker when you have to do something that, urgh, you hate, but your hand has been
 * forced. It doesn't matter what has forced this abomination to exist, you can at least take a
 * tiny amount of solace from labelling it what you feel and telling all who come after you what/
 * how/ why you feel it.
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
public @interface DIAF {
    String why() default "Die in a fire";
}
