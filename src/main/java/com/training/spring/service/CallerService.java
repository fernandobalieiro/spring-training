package com.training.spring.service;

import com.training.spring.model.Caller;
import com.training.spring.repository.CallerRepository;
import org.springframework.stereotype.Service;

@Service
public class CallerService {

    private CallerRepository callerRepository;

    public CallerService(CallerRepository callerRepository) {
        this.callerRepository = callerRepository;
    }

    public Caller getCallerByPhone(final String phone) {
        return callerRepository.getCallerByPhone(phone);
    }
}
