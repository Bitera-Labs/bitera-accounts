package com.bitera.accounts.services.commands;

import com.bitera.accounts.dto.commands.AccountCreateDTO;
import com.bitera.accounts.dto.commands.MoneyCreditDTO;
import com.bitera.accounts.dto.commands.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
