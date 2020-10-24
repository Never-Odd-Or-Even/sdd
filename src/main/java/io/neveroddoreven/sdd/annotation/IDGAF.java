package io.neveroddoreven.sdd.annotation;

import java.lang.annotation.*;

/**
 * Annotation to be used when you've just stopped caring. Whether about this particular thing you're working on, or
 * you've stopped caring in general. Either way the effect is the same. Starting here, continuing here, finishing here,
 * or even forever more - you've simply run out of f*%$s to give. Don't feel bad. We've all been there.
 *
 * It's difficult not to feel for the person coming after you on this one. You're in a bad place (it shows) and you
 * either want the world to know, or you want to remind your self later of where you've been. But, as anyone who has
 * been a recovering anything will tell you - acknowledgement is the first step on the road to recovery. Use this as a
 * starting point on that journey for yourself or, alternatively, use this to tell the person coming after you exactly
 * what you think of them. Either way, I don't give a f*%$.
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE })
public @interface IDGAF {
    String why() default "I don't give a F*%$";
}
