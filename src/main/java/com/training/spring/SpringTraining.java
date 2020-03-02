package com.training.spring;

import com.training.spring.model.CallLog;
import com.training.spring.model.Caller;
import com.training.spring.service.CallLogService;
import com.training.spring.service.CallerService;

public class SpringTraining {

	public static void main(String[] args) {
		String phone = "";

		if (args.length > 0) {
			phone = args[0];
		} else {
			System.out.println("Fist argument must be a phone number.");

			System.exit(1);
		}

		Caller caller = CallerService.getInstance().getCallerByPhone(phone);
		CallLog callLog = CallLogService.getInstance().getCallLogByPhone(phone);

		CallLogService.getInstance().printCallInformation(caller, callLog);
	}
}
