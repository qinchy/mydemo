package com.qinchy.annotation;

import java.lang.annotation.Repeatable;

// Repeatable的意思是Hint可以在一个类上多次使用该注解
@Repeatable(Hints.class)
public @interface Hint {
    String value();
}
