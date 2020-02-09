package com.mycompany.commentsapi.spamdetection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpamAppConfig {

//	@Bean
//	public SpamDetector simpleSpamDetector(@Value("${sbb.spamwords.filename}") String filename) throws IOException {
//		List<String> spamWords = new ArrayList<String>();
//		spamWords = Files.readAllLines(Paths.get(filename));
//		return new SimpleSpamDetector(spamWords);
//	}
//
//	@Bean
//	public ControlFlow controlFlow(SpamDetector spamDetector) {
//		return new ControlFlow(spamDetector);
//	}

}
