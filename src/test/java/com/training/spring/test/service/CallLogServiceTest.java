package com.training.spring.test.service;

import com.training.spring.model.CallLog;
import com.training.spring.service.CallLogService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CallLogServiceTest {

    @Test
    void test() {
        CallLog callLog = CallLogService.getInstance().getCallLogByPhone("+35199999991");
        assertEquals("+35199999991", callLog.getSource());
    }
}
