package com.zk.common.config;

import com.google.common.collect.Maps;
import com.zk.common.utils.PropertiesLoader;

import java.util.Map;

/**
 * Created by zk on 2017/6/5.
 */
public class Global {
    /**
     * 当前对象实例
     */
    private static Global global = new Global();

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();

    /**
     * 属性文件加载对象
     */
    private static PropertiesLoader loader = new PropertiesLoader("ssm.properties");

    /**
     * 获取配置
     * @see ${fns:getConfig('adminPath')}
     */
    public static String getConfig(String key) {
        String value = map.get(key);
        if (value == null){
            value = loader.getProperty(key);
            map.put(key, value != null ? value : "");
        }
        return value;
    }
}
