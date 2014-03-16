package com.ezhao.lamps.utils;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 
 * 获取defaultMessage.properties默认的错误提示信息
 * @author chenhs
 * @date 2014-1-24 上午10:52:11
 */
public class PropFileUtils {
	private static PropFileUtils msgParser = new PropFileUtils();
	private static Properties p = null;
	private static final String fileName = "resources/application.properties";
	protected static final Log log = LogFactory.getLog(PropFileUtils.class);
	
	static{
		init();
	}

	/**
	 * 不允许外部创建实例
	 */
	private PropFileUtils(){
	}
	
	/**
	 * 获取单例方法
	 * @return
	 */
	public static PropFileUtils getInstance(){
		return msgParser;
	}
	
	private static void init(){
		p = new Properties();
		InputStream input = null;
		try{
			input = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
			p.load(input);
		}catch(Exception e){
			log.error("加载defaultMessage.properties文件出错误 - ",e);
		}
	}
	
	/**
	 * 根据key值，获取defaultMessage.properties对应的value值
	 * @param key
	 * @return
	 */
	public String getPropertiesValue(String key){
		return p.getProperty(key);
	}
	
}
