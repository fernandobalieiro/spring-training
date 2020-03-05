package com.training.spring;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.service.CallLogService;
import com.training.spring.service.CallerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SpringTraining {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringTraining.class);

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter phone Number: ");
            String phone = in.nextLine();

            if (phone == null || phone.length() == 0) {
                System.out.println("Phone number cannot be blank.\n");
                continue;
            }

            CallerService callerService = ctx.getBean(CallerService.class);
            CallLogService callLogService = ctx.getBean(CallLogService.class);

            Caller caller = callerService.getCallerByPhone(phone);
            CallLog callLog = callLogService.getCallLogByPhone(phone);

            callLogService.printCallInformation(caller, callLog);

            System.out.println();
        }
    }
}
