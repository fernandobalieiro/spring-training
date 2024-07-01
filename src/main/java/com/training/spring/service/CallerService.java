package com.training.spring.service;

import com.training.spring.model.Caller;
import com.training.spring.repository.CallerRepository;

public class CallerService {

    private static CallerService instance = null;

    private CallerService() {
    }

    public Caller getCallerByPhone(final String phone) {
        return CallerRepository.getInstance().getCallerByPhone(phone);
    }

    public static synchronized CallerService getInstance() {
        if (instance == null) {
            instance = new CallerService();
        }
        return instance;
    }
}
