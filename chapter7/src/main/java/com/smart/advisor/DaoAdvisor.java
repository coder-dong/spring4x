package com.smart.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by coding-dong on 2018/7/5.
 */
public class DaoAdvisor extends StaticMethodMatcherPointcutAdvisor {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return method.getName().startsWith("add") || method.getName().startsWith("del");
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return clazz.isAssignableFrom(UserService.class);
            }
        };
    }
}
