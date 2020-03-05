package com.training.spring.test.service;

import com.training.spring.model.Caller;
import com.training.spring.service.CallerService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallerServiceTest {

    @Test
    public void test() {
        Caller caller = CallerService.getInstance().getCallerByPhone("+35199999991");
        assertEquals("+35199999991", caller.getPhone());
    }
}
