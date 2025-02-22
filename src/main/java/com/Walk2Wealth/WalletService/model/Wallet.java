package com.Walk2Wealth.WalletService.model;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @Column(name = "id")
    private UUID id;
    @Column(name = "address")
    private String address;
    @Column(name = "balance")
    private BigDecimal balance;
    @Column(name = "currency")
    private String currency;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "user_id")
    private String username;
    @Column(name = "private_key")
    private String privateKey;
    @Column(name = "wallet_password")
    private String walletPassword;

    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        if(balance == null) this.balance = BigDecimal.ZERO;
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency() {
        this.currency = "SONIC";
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = Timestamp.from(Instant.now());
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt() {
        this.updatedAt = Timestamp.from(Instant.now());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getWalletPassword() {
        return walletPassword;
    }

    public void setWalletPassword(String walletPassword) {
        this.walletPassword = walletPassword;
    }
}
