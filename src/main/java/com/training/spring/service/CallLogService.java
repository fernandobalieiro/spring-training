package com.training.spring.service;

import com.training.spring.annotation.LogExecutionTime;
import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.repository.CallLogRepository;
import org.springframework.stereotype.Service;

@Service
public class CallLogService {

    private CallLogRepository callLogRepository;

    public CallLogService(CallLogRepository callLogRepository) {
        this.callLogRepository = callLogRepository;
    }

    @LogExecutionTime
    public CallLog getCallLogByPhone(final String phone) {
        return callLogRepository.getCallLogByPhone(phone);
    }

    @LogExecutionTime
    public void printCallInformation(final Caller caller, final CallLog callLog) {
        if (caller == null && callLog == null) {
            System.out.println("Error: Call Information not found.\n");
        } else {
            System.out.println("Call Log Information:");
            System.out.println("Caller: " + caller);
            System.out.println("Call Log: " + callLog + "\n");
        }
    }
}
