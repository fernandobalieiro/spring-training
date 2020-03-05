package com.training.spring.service;

import com.training.spring.annotation.AuditInfo;
import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.repository.CallLogRepository;

public class CallLogService {

    private static CallLogService instance = new CallLogService();

    @AuditInfo(operation = "GET CALL LOG", resourceId = "phone")
    public CallLog getCallLogByPhone(final String phone) {
        return CallLogRepository.getInstance().getCallLogByPhone(phone);
    }

    public void printCallInformation(final Caller caller, final CallLog callLog) {
        if (caller == null && callLog == null) {
            System.out.println("Error: Call Information not found.\n");
        } else {
            System.out.println("Call Log Information:");
            System.out.println("Caller: " + caller);
            System.out.println("Call Log: " + callLog + "\n");
        }
    }

    public static CallLogService getInstance() {
        return instance;
    }
}
