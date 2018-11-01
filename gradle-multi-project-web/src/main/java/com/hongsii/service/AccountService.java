package com.hongsii.service;

import com.hongsii.domain.Account;
import com.hongsii.repository.AccountRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

	private final AccountRepository accountRepository;

	public List<Account> findAll() {
		return accountRepository.findAll();
	}
}