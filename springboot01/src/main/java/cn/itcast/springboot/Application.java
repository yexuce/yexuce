package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot的引导类(入口)
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午3:18:37
 * @version 1.0
 */
@SpringBootApplication(// 该类为SpringBoot的引导类
		scanBasePackages={"cn.itcast.springboot"}) // 指定扫描的基础包
public class Application {

	public static void main(String[] args) {
		/** 第一种方式： 运行SpringBoot应用 */
		//SpringApplication.run(Application.class, args);
		
		/** 第二种方式： 运行SpringBoot应用去掉Banner */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 关闭Banner */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
		
	}
}