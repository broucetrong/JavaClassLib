package com.libs.demo.log;

import org.apache.log4j.Logger;

/**
 * Log4j样例
 *
 * @author broucetrong
 * @version V1.0
 * @since 2019-03-16 9:39
 */
public class Log4jDemo {

    private static final Logger logger = Logger.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}
