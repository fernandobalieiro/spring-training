package com.training.spring.service;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.repository.CallLogRepository;

public class CallLogService {

    private static CallLogService instance = new CallLogService();

    public CallLog getCallLogByPhone(final String phone) {
        return CallLogRepository.getInstance().getCallLogByPhone(phone);
    }

    public void printCallInformation(final Caller caller, final CallLog callLog) {
        System.out.println("Call Log Information:");
        System.out.println("Caller: " + caller);
        System.out.println("Call Log: " + callLog);
    }

    public static CallLogService getInstance() {
        return instance;
    }
}
