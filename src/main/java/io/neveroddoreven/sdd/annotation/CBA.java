package io.neveroddoreven.sdd.annotation;

import java.lang.annotation.*;

/**
 * Annotation to be used when you know you can do better, you know you should do better and, under normal circumstances,
 * you know you would do better. That said, for whatever reason, right here, right now, you really just can't be arsed.
 *
 * Set this marker to give the person coming after you an insight into how you were feeling at this point in time. Set
 * it to remind yourself to come back to it a little later and give it another go. Maybe next time you could give it
 * your best shot and show the world what you can do on your best day? Or, you could, you know, just not bother?
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
public @interface CBA {
    String why() default "Can't be arsed";
}
