package com.mycompany.commentsapi.spamdetection;

public class RemoteSpamDetector implements SpamDetector {

	public RemoteSpamDetector(String url, String username, String password) {
		// Omitted
	}

	public boolean containsSpam(String value) {
		// Make a remote call
		return false;
	}

}
