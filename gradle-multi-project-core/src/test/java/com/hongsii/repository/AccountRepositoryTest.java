package com.hongsii.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.hongsii.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {

	@Autowired
	private AccountRepository accountRepository;

	@Test
	public void save() {
		accountRepository.save(Account.builder()
				.username("hongsii")
				.password("hongsii123")
				.build());
		Account savedAccount = accountRepository.findById(1L).orElse(new Account());

		assertThat(savedAccount.getId()).isEqualTo(1L);
		assertThat(savedAccount.getUsername()).isEqualTo("hongsii");
	}
}