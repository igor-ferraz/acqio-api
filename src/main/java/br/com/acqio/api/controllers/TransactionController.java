package br.com.acqio.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.acqio.api.domain.entities.Transaction;
import br.com.acqio.api.domain.services.ITransactionService;

@RestController
public class TransactionController {
    @Autowired
    private ITransactionService _transactionService;

    @GetMapping("/transaction/all")
    public List<Transaction> getTransactions() {
        return _transactionService.get();
    }

    @PostMapping("/transaction")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return _transactionService.add(transaction);
    }

    @PutMapping("/transaction")
    public Transaction updateTransaction(@RequestBody Transaction transaction) {
        return _transactionService.update(transaction);
    }
}