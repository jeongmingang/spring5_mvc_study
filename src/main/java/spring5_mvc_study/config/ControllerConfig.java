package spring5_mvc_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_mvc_study.HelloController;

@Configuration
//@ComponentScan(basePackages = {"spring5_mvc_study.config"})
public class ControllerConfig {
	
	@Bean
	public HelloController helloController() {
		return new HelloController();
	}
}
