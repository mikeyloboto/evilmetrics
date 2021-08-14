package com.evilbas.metrics.decorators;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
    @Pointcut("within(com.evilbas.*)")
    public void test() {
        System.out.println("test from aspect");
    }

}
