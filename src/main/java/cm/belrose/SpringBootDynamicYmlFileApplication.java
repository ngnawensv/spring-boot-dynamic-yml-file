package cm.belrose;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootDynamicYmlFileApplication implements CommandLineRunner {

	@Autowired
	private InputMapProperties inputMapProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDynamicYmlFileApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Map {}", inputMapProperties.getStringMap());
		log.info("List {}", inputMapProperties.getLists());
	}
}
