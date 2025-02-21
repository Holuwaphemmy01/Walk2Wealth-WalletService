package com.Walk2Wealth.WalletService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String address;
    private String balance;
    private String currency;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String username;
    private String walletKey;
    private String walletPassword;


}
