package com.proguard.demo.annotation;

import com.proguard.demo.enums.MyEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 张全
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface MyAnno {
    String value();
    MyEnum model() default  MyEnum.ONE;
}
