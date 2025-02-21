package com.Walk2Wealth.WalletService.service.createWallet;

import com.Walk2Wealth.WalletService.dtos.request.CreateWalletRequest;
import com.Walk2Wealth.WalletService.model.Wallet;
import com.Walk2Wealth.WalletService.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Keys;
import org.web3j.crypto.ECKeyPair;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

@Service
public class CreateWalletServiceImpl implements CreateWalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Override
    public String createWallet(CreateWalletRequest createWalletRequest) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {

        if(walletRepository.findByUsername(createWalletRequest.getUsername())) throw new IllegalArgumentException("User already exists");
        try{

            Credentials credentials = Credentials.create(Keys.createEcKeyPair());
            Wallet wallet = new Wallet();
            wallet.setUsername(createWalletRequest.getUsername());
            wallet.setAddress(credentials.getAddress());
            wallet.setPrivateKey(credentials.getEcKeyPair().getPrivateKey().toString(16));



            wallet.setWalletPassword(createWalletRequest.getWalletPin());
            Wallet saveWallet = walletRepository.save(wallet);
            return saveWallet.getAddress();



        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
