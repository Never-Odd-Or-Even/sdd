package io.neveroddoreven.sdd.annotation;

import java.lang.annotation.*;

/**
 * Annotation to be used when you know what conventions, standards, methodologies, patterns, and ways
 * of doing things we have in place, but you really don't care. You're bigger, badder, better, smarter
 * than your average bear, a maverick, a go-getter, a revelation, a destroyer-of-worlds, and you
 * want everyone to know it. In short, you do what you want.
 *
 * You go, girl. You do you. You do what you want, and everyone will love you for it. That's how
 * things work around here, right? Right? AMIRITE?
 *
 * #idwiw
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
public @interface IDWIW {
    String why() default "#idwiw";
}
