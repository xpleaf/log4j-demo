package cn.xpleaf.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xpleaf
 * @date 2018/12/12 4:36 PM
 */
public class LogTest {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogTest.class);

        // 通过{}来传入变量，这样就可以不用使用String.format("%s", "info")的方式来传入亦是了
        logger.debug("hello, 日志-{}信息", "debug");
        logger.info("hello, 日志-{}信息", "info");
        logger.warn("hello, 日志-{}信息", "warn");
        logger.error("hello, 日志-{}信息", "error");
    }

}
