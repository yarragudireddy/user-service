package com.santander.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO {
	
	private String id;
	private String senderId;
	private String receivedId;
	private double amount;
	

}
