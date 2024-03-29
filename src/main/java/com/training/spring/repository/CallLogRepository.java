package com.training.spring.repository;

import com.training.spring.model.CallLog;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class CallLogRepository {

    private CallLogRepository instance = null;

    private Map<String, CallLog> callLogs = new HashMap<>();

    public CallLogRepository() {
        createCallLogs();
    }

    public CallLog getCallLogByPhone(final String phone) {
        return this.callLogs.get(phone);
    }

    private void createCallLogs() {
        Random random = new Random();

        IntStream.range(0, 10).forEach(i -> {
                    CallLog callLog = new CallLog();
                    String phone = "+3519999999" + i;
                    callLog.setSource(phone);
                    callLog.setDestination("+351" + Integer.valueOf(random.nextInt((999999999 - 888888888) + 1) + 888888888).toString());
                    long currentTimeMillis = System.currentTimeMillis();
                    callLog.setStartTime(new Date(currentTimeMillis));
                    callLog.setEndTime(new Date(currentTimeMillis - 60000));
                    this.callLogs.put(phone, callLog);
                }
        );
    }

    public CallLogRepository getInstance() {
        if (instance == null) {
            instance = new CallLogRepository();
        }
        return instance;
    }
}
