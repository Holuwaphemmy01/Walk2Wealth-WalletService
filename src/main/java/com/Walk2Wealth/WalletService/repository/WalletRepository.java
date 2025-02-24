package com.Walk2Wealth.WalletService.repository;

import com.Walk2Wealth.WalletService.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {

    Wallet[] findWalletByUsername(String username);

}
