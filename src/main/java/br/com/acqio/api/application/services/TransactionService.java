package br.com.acqio.api.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.acqio.api.domain.entities.Transaction;
import br.com.acqio.api.domain.repositories.ITransactionRepository;
import br.com.acqio.api.domain.services.ITransactionService;

@Service
public class TransactionService implements ITransactionService {
    @Autowired
    private ITransactionRepository _transactionRepository;

    public List<Transaction> get() {
        return _transactionRepository.findAll();
    }

    public Transaction add(Transaction transaction) {
        return _transactionRepository.save(transaction);
    }

    public Transaction update(Transaction transaction) { 
        return _transactionRepository.save(transaction);
    }
}