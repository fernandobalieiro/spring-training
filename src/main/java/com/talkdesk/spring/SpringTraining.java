package com.talkdesk.spring;

public class SpringTraining {

	public static void main(String[] args) {
		String phone = "";

		if (args.length > 0) {
			phone = args[0];
		} else {
			System.out.println("Fist argument must be a phone number.");

			System.exit(1);
		}

		// TODO Retrieve call information by phone using Services classes.
	}
}
