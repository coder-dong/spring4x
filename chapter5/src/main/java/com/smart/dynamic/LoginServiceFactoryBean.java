package com.smart.dynamic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by coding-dong on 2018/6/10.
 */
@Component
public class LoginServiceFactoryBean implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory df = (DefaultListableBeanFactory) beanFactory;

        BeanDefinitionBuilder beanDefinitionBuilder =
                BeanDefinitionBuilder.genericBeanDefinition(LoginService.class);

//        beanDefinitionBuilder.addPropertyReference("loginDao", "loginDao");

        df.registerBeanDefinition("loginService1", beanDefinitionBuilder.getRawBeanDefinition());

        df.registerSingleton("loginService2", new LoginService());

        df.registerSingleton("loginDao", new LoginDao());

    }
}
