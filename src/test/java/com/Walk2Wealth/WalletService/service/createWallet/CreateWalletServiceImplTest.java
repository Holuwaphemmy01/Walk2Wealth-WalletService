package com.Walk2Wealth.WalletService.service.createWallet;

import com.Walk2Wealth.WalletService.dtos.request.CreateWalletRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;


@SpringBootTest
class CreateWalletServiceImplTest {

    @Autowired
    public CreateWalletServiceImpl createWalletService;



    @Test
    public void createWallet() throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        CreateWalletRequest createWalletRequest = new CreateWalletRequest();
        createWalletRequest.setUsername("Akinzo");
        createWalletRequest.setWalletPin("123456789");
        System.out.println(createWalletService.createWallet(createWalletRequest));
    }



}