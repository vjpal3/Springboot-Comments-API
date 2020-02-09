package com.mycompany.commentsapi.spamdetection;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SpamCheckerApp {

	public static void main(String[] args) throws Exception {
		List<String> spamWords = new ArrayList<String>();

		if (args.length == 2) {
			spamWords = Files.readAllLines(Paths.get(args[1]));

		}
		SimpleSpamDetector spamDetector = new SimpleSpamDetector(spamWords);
		System.out.println(spamDetector.containsSpam(args[0]));
	}

}
