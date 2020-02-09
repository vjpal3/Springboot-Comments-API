package com.mycompany.commentsapi.spamdetection;

public class SpamCheckerApp {

	public static void main(String[] args) throws Exception {

		SpamDetector spamDetector = SpamDetectorFactory.getInstance(args);
		System.out.println(spamDetector.containsSpam(args[0]));
	}

}
