package com.Walk2Wealth.WalletService.controller.create_wallet;

import com.Walk2Wealth.WalletService.dtos.request.CreateWalletRequest;
import com.Walk2Wealth.WalletService.service.createWallet.CreateWalletServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/create-wallet")
public class CreateWalletController {

    @Autowired
    private CreateWalletServiceImpl createWalletService;

    @PostMapping
    public ResponseEntity<?> createWallet(@RequestBody CreateWalletRequest createWalletRequest) {

        try{
               String wallet = createWalletService.createWallet(createWalletRequest);
               return new ResponseEntity<>(wallet, HttpStatus.CREATED);

        } catch (Exception e) {
           return ResponseEntity.status(400).body(e.getMessage());
        }

    }




}
