package com.minlian.simulate.ioc.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class BeanFactory {
    private static Properties properties;
    private static HashMap<String, Object> beans;

    static {
        try {
            properties = new Properties();
            InputStream rs = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(rs);
            beans = new HashMap<String, Object>();
            Enumeration<Object> keys = properties.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = (String) properties.get(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError("properties初始化失败");
        }
    }
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
