package com.example.springbootpoc;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {

    boolean withTrim() default false;
    String value() default "none";

    int min() default 0;

    int max() default 0;

}
