package com.training.spring.repository;

import com.training.spring.model.Caller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CallerRepository {

    private static final CallerRepository instance = new CallerRepository();

    private final Map<String, Caller> callers = new HashMap<>();

    public CallerRepository() {
        createCallers();
    }

    public Caller getCallerByPhone(final String phone) {
        return this.callers.get(phone);
    }

    private void createCallers() {
        IntStream.range(0, 10).forEach(i -> {
                    Caller caller = new Caller();
                    caller.setFirstName("Caller");
                    caller.setFirstName("" + i);
                    caller.setBirthDayDate(new Date());
                    String phone = "+3519999999" + i;
                    caller.setPhone(phone);
                    this.callers.put(phone, caller);
                }
        );
    }

    public static CallerRepository getInstance() {
        return instance;
    }
}
