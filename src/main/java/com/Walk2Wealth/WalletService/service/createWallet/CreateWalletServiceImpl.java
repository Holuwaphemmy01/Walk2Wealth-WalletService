package com.Walk2Wealth.WalletService.service.createWallet;

import com.Walk2Wealth.WalletService.dtos.request.CreateWalletRequest;
import com.Walk2Wealth.WalletService.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateWalletServiceImpl implements CreateWalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Override
    public String createWallet(CreateWalletRequest createWalletRequest) {

        return "";
    }
}
