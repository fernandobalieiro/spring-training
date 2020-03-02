package com.talkdesk.spring.service;

import com.talkdesk.spring.model.CallLog;
import com.talkdesk.spring.model.Caller;

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
