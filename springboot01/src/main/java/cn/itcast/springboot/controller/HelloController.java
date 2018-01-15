package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.springboot.service.UserService;

/**
 * HelloController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午3:26:18
 * @version 1.0
 */
@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;
	/** 一次性全部加载属性文件中的属性 */
	@Autowired
	private Environment environment; 
	/** 单个的属性注入 */
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;

	@GetMapping("/hello")
	public String hello(){
		userService.save();
		
		System.out.println("name:" + environment.getProperty("name"));
		System.out.println("url:" + environment.getProperty("url"));
		
		System.out.println("name===" + name);
		System.out.println("url===" + url);
		return "Hello SpringBoot!";
	}
}