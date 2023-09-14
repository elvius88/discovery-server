package py.com.jaha.api.discovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class DiscoveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApiApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void doAfterStartup() {
		log.info("Discovery Server has already started");
	}
}
