package com.santander.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TransactionEntity {
	
	@Id
	private String id;
	private String senderId;
	private String receivedId;
	private double amount;
	

}
