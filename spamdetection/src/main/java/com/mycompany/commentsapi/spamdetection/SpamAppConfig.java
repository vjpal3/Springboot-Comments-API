package com.mycompany.commentsapi.spamdetection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpamAppConfig {

	@Bean
	public SpamDetector simpleSpamDetector(@Value("${sbb.spamwords.filename}") String filename) throws IOException {
		List<String> spamWords = new ArrayList<String>();
		spamWords = Files.readAllLines(Paths.get(filename));
		return new SimpleSpamDetector(spamWords);
	}

	@Bean
	public ControlFlow controlFlow(SpamDetector spamDetector) {
		return new ControlFlow(spamDetector);
	}

}
