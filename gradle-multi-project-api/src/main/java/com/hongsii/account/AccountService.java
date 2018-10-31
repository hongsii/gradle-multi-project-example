package com.hongsii.account;

import com.hongsii.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

	private final AccountRepository accountRepository;
}
