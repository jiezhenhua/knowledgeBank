package com.zhjie.common.init;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
/**
 * 缓存数据字典
 * @author Administrator
 *
 */
@Component
public class DataCache {
 
	public static List<String> list = new ArrayList<String>();
	//注解是操作的关键
	@PostConstruct
	public void init(){
        System.out.println("系统运行开始");
        //放数据到静态的list中就是放到内存中,全局通用
        //单例实现
        CodeEnum.getInstance();
	}
 
        @PreDestroy
        public void destroy(){
            System.out.println("系统运行结束");
        }
 
}
