package cn.eastdc.aop;

import cn.eastdc.annotation.Log;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * Created by zhming on 2017/5/18.
 */
@Configuration
public class LogAop extends AbstractPointcutAdvisor {

    @Override
    public Advice getAdvice() {
        return new MethodInterceptor() {
            @Override
            public Object invoke(MethodInvocation methodInvocation) throws Throwable {
                String name = methodInvocation.getMethod().getName();
                String logValue = methodInvocation.getMethod().getAnnotation(Log.class).value();
                System.out.println(logValue);
                Object object = methodInvocation.proceed();
                System.out.println("end:" + name);
                return object;
            }
        };
    }

    @Override
    public Pointcut getPointcut() {
        return new AnnotationMatchingPointcut(null, Log.class);
    }
}
