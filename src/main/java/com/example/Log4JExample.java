package com.example;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4JExample {
	
	static Logger log1 = Logger.getLogger(Log4JExample.class.getName());
	// JAVA Standard LOG
	static Log log2 = LogFactory.getLog(Log4JExample.class);
	// Apache Commons log => Spring, Hadoop, 
	static org.apache.log4j.Logger log3 = org.apache.log4j.Logger.getLogger(Log4JExample.class);
	// Apache Log4J
	public static void main(String[] args) {
		log1.info("##################");
		log1.info("util logging...");
		log1.info("##################");
		
		log2.info("##################");
		log2.info("commons logging...");
		log2.info("##################");
		
		log3.info("##################");
		log3.info("log4J logging...");
		log3.info("##################");
	}
}
