package kh.link_up;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//시큐리티 기능을 잠시 비활성화 함
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class LinkUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkUpApplication.class, args);
	}

}
