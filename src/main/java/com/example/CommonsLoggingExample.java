package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLoggingExample {

	static Log log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger log2 = Logger.getLogger(CommonsLoggingExample.class.getName());
	
	public static void main(String[] args) {
																		// info Level 이상만 출력
		log2.log(Level.INFO, "Java standard logger...");	
		
		log.trace(  "Commons TRACE 1 level log");		// 제어 흐름 추적 (흐름 전부 출력) 
		log.debug("Commons DEBUG 2 level log");		// 처리과정을 확인하기 위한 데이터 로그
		log.info(   "Commons INFO  3 level log");		// 일반적인 정보성 로그
		log.warn(  "Commons WARN 4 level log");		// 경고 수준의 로그
		log.error(  "Commons ERROR 5 level log");		// 일반적인 에러 발생 
		log.fatal(  "Commons FATAL 6 level log");   		// 중대한 에러 - 프로그램 수행 불가
		log.info("########################");
	}

}
