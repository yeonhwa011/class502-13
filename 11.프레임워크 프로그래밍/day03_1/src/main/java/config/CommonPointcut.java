package config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {

    @Pointcut("execution(* exan01..*(..))")
    public void publicTarget(){}
}
