package com.santander.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.dto.TransactionDTO;
import com.santander.dto.TransactionIdDTO;
import com.santander.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping(value = "/transactions/{senderId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TransactionDTO>> getTransactionBySenderId(@PathVariable("senderId") String senderId) {
		List<TransactionDTO> transactionBySenderId = transactionService.getTransactionBySenderId(senderId);
		return new ResponseEntity<List<TransactionDTO>>(transactionBySenderId,HttpStatus.OK);
	}

	@GetMapping(value = "/transactions", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TransactionDTO>> getAllTransactions() {

		List<TransactionDTO> getAllTransactions = transactionService.getAllTransactions();

		return new ResponseEntity<List<TransactionDTO>>(getAllTransactions,HttpStatus.OK);
	}

	@PostMapping(value = "/transaction", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TransactionIdDTO> saveTransactions(@RequestBody TransactionDTO transactionEntity) {
		String transactionId = transactionService.saveTransactions(transactionEntity);
		TransactionIdDTO transactionIdDTO=new TransactionIdDTO();
		transactionIdDTO.setId(transactionId);
		return new ResponseEntity<TransactionIdDTO>(transactionIdDTO, HttpStatus.CREATED);

	}

}
