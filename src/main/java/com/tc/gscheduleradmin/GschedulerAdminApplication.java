package com.tc.gscheduleradmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = "com.tc")
@EnableSwagger2
@EnableCaching
public class GschedulerAdminApplication {


	public static void main(String[] args) {
		SpringApplication.run(GschedulerAdminApplication.class, args);
	}

}
