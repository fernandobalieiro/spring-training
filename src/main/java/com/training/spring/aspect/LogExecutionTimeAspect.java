package com.training.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.text.MessageFormat;

@Aspect
@Component
public class LogExecutionTimeAspect {

    @Around(value = "@annotation(com.training.spring.annotation.LogExecutionTime)")
    public Object logExecutionTime(final ProceedingJoinPoint joinPoint) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // FIXME You must call the target method here, store the result using ProceedingJoinPoint instance.
        Object proceed = null; // ???

        stopWatch.stop();

        String message = MessageFormat.format("\tMethod {0}.{1} executed in {2}ms", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), stopWatch.getTotalTimeMillis());

        System.out.println(message);

        return proceed;
    }
}
