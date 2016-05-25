package com.uilzzw.common;

import org.apache.log4j.Logger;

public class ConstantUtils {
    private static final Logger LOGGER = Logger.getLogger(ConstantUtils.class);
    
    //日志Logging
    public static Logger getLogger() {
	return LOGGER;
    }

    // 获取系统用户的用户目录
    public static String getUserHome() {
	return System.getProperty("user.home");
    }

    // 获取指定当前类文件的绝对路径
    public static String getAbsolutePath(Class<?> clazz) {
	return clazz.getResource("").getPath().substring(1).replace("/", "\\");
    }

    // 获取当前项目的路径
    public static String getProjectPath() {
	return System.getProperty("user.dir")+"\\";
    }

}
