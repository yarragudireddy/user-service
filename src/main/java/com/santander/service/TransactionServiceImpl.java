package com.santander.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.santander.dto.TransactionDTO;
import com.santander.entity.TransactionEntity;
import com.santander.repository.TransactionRepository;
import com.santander.util.TransactionConstants;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository repository;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ModelMapper modelMapper;

	public List<TransactionDTO> getTransactionBySenderId(String senderId) {

		List<TransactionEntity> transactionBySenderIdList = repository.getTransactionBySenderId(senderId);
		List<TransactionDTO> transactionDTO = transactionBySenderIdList.stream()
				.map(transactionEntity -> modelMapper.map(transactionEntity, TransactionDTO.class))
				.collect(Collectors.toList());
		return transactionDTO;
	}

	public List<TransactionDTO> getAllTransactions() {
		List<TransactionEntity> trasactionsList = repository.findAll();
		return trasactionsList.stream()
				.map(transactionEntity -> modelMapper.map(transactionEntity, TransactionDTO.class))
				.collect(Collectors.toList());

	}

	public String saveTransactions(TransactionDTO transactionDTO) {
		TransactionEntity transactionEntity = modelMapper.map(transactionDTO, TransactionEntity.class);
		ResponseEntity<String> id = restTemplate.getForEntity(TransactionConstants.URI, String.class);
		transactionEntity.setId(id.getBody());
		return repository.save(transactionEntity).getId();

	}

}
