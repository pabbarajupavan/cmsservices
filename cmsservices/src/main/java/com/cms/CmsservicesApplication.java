package com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${app.prop.dir}/cms.properties")
public class CmsservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsservicesApplication.class, args);
	}

}
