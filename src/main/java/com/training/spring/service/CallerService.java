package com.training.spring.service;

import com.training.spring.annotation.AuditInfo;
import com.training.spring.model.Caller;
import com.training.spring.repository.CallerRepository;

public class CallerService {

    private static CallerService instance = new CallerService();

    @AuditInfo(operation = "GET CALLER", resourceId = "phone")
    public Caller getCallerByPhone(final String phone) {
        return CallerRepository.getInstance().getCallerByPhone(phone);
    }

    public static CallerService getInstance() {
        return instance;
    }
}
