package com.training.spring.test.service;

import com.training.spring.AppConfig;
import com.training.spring.model.CallLog;
import com.training.spring.service.CallLogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CallLogServiceTest {

    private CallLogService callLogService;

    @Test
    public void test() {
        CallLog callLog = callLogService.getCallLogByPhone("+35199999991");
        assertEquals("+35199999991", callLog.getSource());
    }
}
