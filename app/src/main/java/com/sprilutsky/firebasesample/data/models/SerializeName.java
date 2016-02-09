package com.sprilutsky.firebasesample.data.models;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SerializeName {

    String fieldName() default "";
}
