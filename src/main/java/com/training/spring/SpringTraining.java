package com.training.spring;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.service.CallLogService;
import com.training.spring.service.CallerService;

import java.util.Scanner;

public class SpringTraining {

    public static void main(String[] args) {
        CallerService callerService = CallerService.getInstance();
        CallLogService callLogService = CallLogService.getInstance();


        // About Java Reflections
        // Using Evaluate Expression:

        // Print all annotated methods for the given class. CHECK CONSOLE
//		Arrays.stream(callerService.getClass().getMethods()).forEach(method -> System.out.println(Arrays.toString(method.getAnnotations())));

        // Annotation from the method
//      callerService.getClass().getMethods()[0].getAnnotation(AuditInfo.class)


        // A valid phone number to try out: +35199999991

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter phone Number: ");
            String phone = in.nextLine();

            Caller caller = callerService.getCallerByPhone(phone);
            CallLog callLog = callLogService.getCallLogByPhone(phone);

            CallLogService.getInstance().printCallInformation(caller, callLog);
            System.out.println();
        }
    }
}
