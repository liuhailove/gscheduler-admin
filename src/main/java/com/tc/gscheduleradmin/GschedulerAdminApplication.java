package com.tc.gscheduleradmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(scanBasePackages = "com.tc")
@EnableCaching
public class GschedulerAdminApplication {


	public static void main(String[] args) {
		SpringApplication.run(GschedulerAdminApplication.class, args);
	}

}
