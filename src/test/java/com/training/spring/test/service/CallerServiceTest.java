package com.training.spring.test.service;

import com.training.spring.model.Caller;
import com.training.spring.service.CallerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CallerServiceTest {

    @Autowired
    private CallerService callerService;

    @Test
    void test() {
        Caller caller = callerService.getCallerByPhone("+35199999991");
        assertEquals("+35199999991", caller.getPhone());
    }
}
