package com.var.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.var.model.Account;
import com.var.service.AccountService;

import jakarta.websocket.server.PathParam;

@RestController   //@Component
public class AccounController {  //CRUD - create, read , update , delete
	@Autowired
	AccountService accountService;
	@GetMapping("/account")
	public List<Account> getAccount() {
        List<Account> accountList=accountService.listAccounts();		
		return accountList;
	}
	@PostMapping("/account")
	public String addAccount(@RequestBody Account account) {
		accountService.addAccount(account);
		return "  account details added successfully";
	}
	@PutMapping("/account/{id}")
	public String updateAccount(@PathParam("id") Integer id) {
		accountService.updateAccount(id);
		return "  account details updated successfully";
	}
	@DeleteMapping("/account/{id}")
	public String deleteAccount(@PathParam("id")Integer id) {
		accountService.deleteAccount(id);
		return " account details deleted successfully";
	}
}
