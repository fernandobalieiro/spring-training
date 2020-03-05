package com.training.spring.test.service;

import com.training.spring.model.CallLog;
import com.training.spring.service.CallLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CallLogServiceTest {

    @Autowired
    private CallLogService callLogService;

    @Test
    public void test() {
        CallLog callLog = callLogService.getCallLogByPhone("+35199999991");
        assertEquals("+35199999991", callLog.getSource());
    }
}
