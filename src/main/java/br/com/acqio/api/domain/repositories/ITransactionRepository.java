package br.com.acqio.api.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.acqio.api.domain.entities.Transaction;

@Repository
public interface ITransactionRepository extends JpaRepository<Transaction, Long> { }