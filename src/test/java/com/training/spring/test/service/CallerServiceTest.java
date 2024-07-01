package com.training.spring.test.service;

import com.training.spring.model.Caller;
import com.training.spring.service.CallerService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CallerServiceTest {

    @Test
    void test() {
        Caller caller = CallerService.getInstance().getCallerByPhone("+35199999991");
        assertEquals("+35199999991", caller.getPhone());
    }
}
