package com.training.spring.service;

import com.training.spring.model.Caller;
import com.training.spring.repository.CallerRepository;

public class CallerService {

    private static final CallerService instance = new CallerService();

    public Caller getCallerByPhone(final String phone) {
        return CallerRepository.getInstance().getCallerByPhone(phone);
    }

    public static CallerService getInstance() {
        return instance;
    }
}
