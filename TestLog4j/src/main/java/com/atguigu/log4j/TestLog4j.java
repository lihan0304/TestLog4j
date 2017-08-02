package com.atguigu.log4j;

import org.apache.log4j.Logger;

public class TestLog4j {
	private static final Logger logger = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) {
		logger.debug("hello-------------1");
		logger.info("hello-------------2");
		logger.warn("hello-------------3");
		logger.error("hello------------4");
	}
}
