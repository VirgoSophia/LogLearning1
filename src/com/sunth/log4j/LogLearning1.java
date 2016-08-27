package com.sunth.log4j;

import org.apache.log4j.Logger;

public class LogLearning1 {
	
	private static Logger logger = Logger.getLogger(LogLearning1.class);
	
	public static void main(String[] args) {
		
		//记录debug及以上级别的信息
		logger.debug("This is debug message.");
		
		//记录info及以上级别的信息
		logger.info("This is info message.");
		
		//记录error级别的信息
		logger.error("This is error message.");
		
	}

}
