package com.training.spring.test.service;

import com.training.spring.model.CallLog;
import com.training.spring.service.CallLogService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CallLogServiceTest {

    @Autowired
    private CallLogService callLogService;

    @Test
    void test() {
        CallLog callLog = callLogService.getCallLogByPhone("+35199999991");
        assertEquals("+35199999991", callLog.getSource());
    }
}
