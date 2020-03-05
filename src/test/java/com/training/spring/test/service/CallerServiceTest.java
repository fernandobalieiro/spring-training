package com.training.spring.test.service;

import com.training.spring.AppConfig;
import com.training.spring.model.Caller;
import com.training.spring.service.CallerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CallerServiceTest {

    private CallerService callerService;

    @Test
    public void test() {
        Caller caller = callerService.getCallerByPhone("+35199999991");
        assertEquals("+35199999991", caller.getPhone());
    }
}
