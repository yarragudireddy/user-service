package com.santander.service;

import java.util.List;

import com.santander.dto.TransactionDTO;

public interface TransactionService {

	public List<TransactionDTO> getTransactionBySenderId(String senderId);

	public List<TransactionDTO> getAllTransactions();

	public String saveTransactions(TransactionDTO transactionDTO);

}
