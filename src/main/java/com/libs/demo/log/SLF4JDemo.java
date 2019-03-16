package com.libs.demo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J样例
 * https://www.cnblogs.com/xrq730/p/8619156.html
 * http://www.importnew.com/7450.html
 *
 * @author broucetrong
 * @version V1.0
 * @since 2019-03-16 9:39
 */
public class SLF4JDemo {

    private static final Logger logger = LoggerFactory.getLogger(SLF4JDemo.class);

    public static void main(String[] args) {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");
    }
}
