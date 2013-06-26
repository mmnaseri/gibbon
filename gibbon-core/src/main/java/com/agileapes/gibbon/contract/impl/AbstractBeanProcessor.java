package com.agileapes.gibbon.contract.impl;

import com.agileapes.gibbon.contract.BeanProcessor;
import com.agileapes.gibbon.contract.OrderedBean;
import com.agileapes.gibbon.error.RegistryException;

/**
 * This is an abstract bean processor that enables you to implement any processor anonymously in a more readable fashion
 *
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (6/12/13, 3:07 PM)
 */
public abstract class AbstractBeanProcessor implements BeanProcessor, OrderedBean {

    private final int order;

    public AbstractBeanProcessor(int order) {
        this.order = order;
    }

    public AbstractBeanProcessor() {
        this.order = 0;
    }

    @Override
    public Object postProcessBeforeRegistration(Object bean, String beanName) throws RegistryException {
        return bean;
    }

    @Override
    public Object postProcessBeforeDispense(Object bean, String beanName) throws RegistryException {
        return bean;
    }

    @Override
    public int getOrder() {
        return order;
    }
}
