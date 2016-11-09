package demo.Controller;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableAutoConfiguration
@ComponentScan
@EntityScan(basePackages="demo.model")
@EnableJpaRepositories(basePackages="demo.Dao")
public class SpringDemoApplication {

	private static Logger logger = Logger.getLogger(SpringDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		logger.info("============= SpringBoot Start Success =============");
	}
}
