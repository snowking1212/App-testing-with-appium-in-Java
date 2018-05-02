package com.dan.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

/**
 * 根据配置文件获取系统配置属性
 * @author chang.lu
 *
 */

@Component
@Configuration
@PropertySource(value = {"config.properties"},encoding="utf-8")

public class Config {
	
	public final static String ANDROID = "Android";
	public final static String IOS = "IOS";
	public static String Platform;
	
	static Environment evn ;
	
	
	
	public Config(Environment evn1) {
		evn = evn1;
		this.Platform = evn.getProperty("auto.platform",ANDROID);
	}
	
	/**
	 * 根据配置项名称获取配置参数，如果获取不到，则返回默认值
	 * @param name 配置项名称
	 * @param defaultValue 默认值
	 * @return
	 */
	public static String get(String name,String defaultValue) {
		return evn.getProperty(name, defaultValue);
	}
	
	/**
	 * 根据配置项名称获取配置参数，如果获取不到，则返回null
	 * @param name
	 * @return
	 */
	public static String get(String name) {
		return evn.getProperty(name);
	}
	
	
}

