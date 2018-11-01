package com.hongsii.controller;

import com.hongsii.domain.Account;
import com.hongsii.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AccountController {

	private final AccountService accountService;

	@GetMapping("/list")
	public List<Account> list() {
		return accountService.findAll();
	}
}
