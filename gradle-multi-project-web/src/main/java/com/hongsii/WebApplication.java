package com.hongsii;

import com.hongsii.domain.Account;
import com.hongsii.repository.AccountRepository;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebApplication {

	@Autowired
	private AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner() {
		return (args -> {
			IntStream.rangeClosed(1, 10).forEach(index -> accountRepository.save(Account.builder()
					.username("hongsii" + index)
					.password("hongsii123")
					.build()));
		});
	}
}
