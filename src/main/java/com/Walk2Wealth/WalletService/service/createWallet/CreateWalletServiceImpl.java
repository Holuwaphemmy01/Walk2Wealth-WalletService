package com.Walk2Wealth.WalletService.service.createWallet;

import com.Walk2Wealth.WalletService.dtos.request.CreateWalletRequest;
import com.Walk2Wealth.WalletService.model.Wallet;
import com.Walk2Wealth.WalletService.repository.WalletRepository;
import com.Walk2Wealth.WalletService.service.encryptAndDecrypt.EncryptionAndDecryption;
import com.Walk2Wealth.WalletService.service.hashPassword.HashPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.Hash;
import org.web3j.crypto.Keys;
import org.web3j.crypto.ECKeyPair;

import java.math.BigDecimal;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.sql.Timestamp;

@Service
public class CreateWalletServiceImpl implements CreateWalletService {

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private HashPassword hashPassword;


    @Override
    public String createWallet(CreateWalletRequest createWalletRequest) throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {

        try{

            Credentials credentials = Credentials.create(Keys.createEcKeyPair());
            Wallet wallet = new Wallet();
            wallet.setId();
            wallet.setUsername(createWalletRequest.getUsername());
            String encrypted = EncryptionAndDecryption.encryptPrivateKey(credentials.getEcKeyPair().getPrivateKey().toString(),createWalletRequest.getWalletPin());
            wallet.setPrivateKey(encrypted);
            wallet.setAddress(credentials.getAddress());
            wallet.setCreatedAt();
            wallet.setUpdatedAt();
            wallet.setCurrency();
            wallet.setBalance(BigDecimal.ZERO);
            wallet.setWalletPassword(hashPassword.hash(createWalletRequest.getWalletPin()));
            Wallet saveWallet = walletRepository.save(wallet);
            return saveWallet.getAddress();

        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
