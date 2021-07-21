package com.kodilla.patterns2.facade.api;


import com.kodilla.patterns2.aop.calculator.Watcher;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class AspectProcessOrder {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectProcessOrder.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(orderDto, id) && target(object)")
    public void log(final OrderDto orderDto, final Long id, Object object) {
        LOGGER.info("Logging the orderProcess method");
        LOGGER.info("Class: " + object.getClass().getName() + " id:" + id);
    }
}

