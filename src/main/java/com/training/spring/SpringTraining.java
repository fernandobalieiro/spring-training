package com.training.spring;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.service.CallLogService;
import com.training.spring.service.CallerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class SpringTraining {

    public static void main(String[] args) {

        //Method 1
//        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.training.spring");

//        //Method 2
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        CallerService callerService = ctx.getBean(CallerService.class);
        CallLogService callLogService = ctx.getBean(CallLogService.class);

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
