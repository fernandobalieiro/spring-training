package com.training.spring;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.service.CallLogService;
import com.training.spring.service.CallerService;

import java.util.Scanner;

public class SpringTraining {

    public static void main(String[] args) {
        //FIXME
        CallerService callerService = //???
        CallLogService callLogService = //???

        // A valid phone number to try out: +35199999991

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter phone Number: ");
            String phone = in.nextLine();

            if (phone == null || phone.length() == 0) {
                System.out.println("Phone number cannot be blank.\n");
                continue;
            }

            // TODO Invoke CallerService and CallLogService methods classes here
            Caller caller = //???
            CallLog callLog = //???

            // TODO Print the result calling callLogService.printCallInformation() method;
        }
    }
}
