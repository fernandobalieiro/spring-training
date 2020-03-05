package com.training.spring.service;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.repository.CallLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallLogService {

    private CallLogRepository callLogRepository;

    @Autowired
    public CallLogService(CallLogRepository callLogRepository) {
        this.callLogRepository = callLogRepository;
    }

    public CallLog getCallLogByPhone(final String phone) {
        return callLogRepository.getCallLogByPhone(phone);
    }

    public void printCallInformation(final Caller caller, final CallLog callLog) {
        System.out.println("Call Log Information:");
        System.out.println("Caller: " + caller);
        System.out.println("Call Log: " + callLog);
    }
}
