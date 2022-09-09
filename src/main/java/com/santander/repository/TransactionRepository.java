package com.santander.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.santander.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, String>{
	
	@Query(value = "SELECT o FROM TransactionEntity o WHERE o.senderId=:senderId  ")
	List<TransactionEntity> getTransactionBySenderId(@Param("senderId") String senderId);

}
