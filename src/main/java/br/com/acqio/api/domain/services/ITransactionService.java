package br.com.acqio.api.domain.services;

import java.util.List;

import br.com.acqio.api.domain.entities.Transaction;

public interface ITransactionService {
    public List<Transaction> get();
    
    public Transaction update(Transaction transaction);
    
    public Transaction add(Transaction transaction);
}