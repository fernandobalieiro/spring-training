package com.training.spring.service;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;

public class CallLogService {

    public CallLog getCallLogByPhone(final String phone) {
        // FIXME Invoke method repository here.
        return null;
    }

    public void printCallInformation(final Caller caller, final CallLog callLog) {
        System.out.println("Call Log Information:");
        System.out.println("Caller: " + caller);
        System.out.println("Call Log: " + callLog);
    }
}
