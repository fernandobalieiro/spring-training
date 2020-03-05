package com.training.spring;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.service.CallLogService;
import com.training.spring.service.CallerService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

import static org.springframework.boot.Banner.Mode.OFF;

@SpringBootApplication
public class SpringTraining {

    private static CallLogService callLogService;
    private static CallerService callerService;

    public SpringTraining(CallLogService callLogService, CallerService callerService) {
        SpringTraining.callLogService = callLogService;
        SpringTraining.callerService = callerService;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringTraining.class).bannerMode(OFF).logStartupInfo(false).run(args);

        // A valid phone number to try out: +35199999991

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter phone Number: ");
            String phone = in.nextLine();

            if (phone == null || phone.length() == 0) {
                System.out.println("Phone number cannot be blank.\n");
                continue;
            }

            Caller caller = callerService.getCallerByPhone(phone);
            CallLog callLog = callLogService.getCallLogByPhone(phone);

            callLogService.printCallInformation(caller, callLog);

            System.out.println();
        }
    }
}
