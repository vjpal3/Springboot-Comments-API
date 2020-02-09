package com.mycompany.commentsapi.spamdetection;

import java.io.IOException;

public class ControlFlow {

	private SpamDetector spamDetector = null;

	public ControlFlow(SpamDetector spamDetector) {
		super();
		this.spamDetector = spamDetector;
	}

	public void run(String[] args) throws IOException {

		System.out.println(spamDetector.containsSpam(args[0]));
	}

}
