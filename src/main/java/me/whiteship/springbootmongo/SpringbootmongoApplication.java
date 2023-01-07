package me.whiteship.springbootmongo;

import me.whiteship.springbootmongo.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringbootmongoApplication {

	@Autowired
	MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmongoApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return args -> {
			Account account = new Account();
			account.setEmail("aaa@bbb");
			account.setUsername("aaa");
			account.setUsername("aaa");

			mongoTemplate.save(account);

			System.out.println("finished");
		};
	}

}
