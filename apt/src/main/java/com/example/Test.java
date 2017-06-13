package com.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by jin on 2017/6/13.
 */

@Retention(RetentionPolicy.CLASS)
public @interface Test {
    String value();
}
