package com.Walk2Wealth.WalletService.service.createWallet;


import com.Walk2Wealth.WalletService.dtos.request.CreateWalletRequest;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public interface CreateWalletService {

    String createWallet(CreateWalletRequest createWalletRequest) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException;

}
