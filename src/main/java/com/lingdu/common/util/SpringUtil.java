package com.lingdu.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * 获取spring管理的对象
 * @author Administrator
 */
public class SpringUtil {
	static {
		SpringUtil.init("classpath:application.xml");
	}
	private static ApplicationContext ctx;
	public static void init(String xmlpath){
		ctx = new ClassPathXmlApplicationContext(xmlpath);
	}
	
	public static Object getBean(String id){
		return ctx.getBean(id);
	}
	public static <T> T getBean(Class<T> type){
		return ctx.getBean(type);
	}
	
	public static void main(String[] args) {
		SpringUtil.init("classpath:application.xml");
	}
}
