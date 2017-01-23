package api.utils.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// base: http://stackoverflow.com/questions/5674774/running-junit-test-in-parallel-on-suite-level

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Parallel {
	int threads() default 30;
}
