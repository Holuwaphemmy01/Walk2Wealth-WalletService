package com.Walk2Wealth.WalletService.service.get_private_key;


import com.Walk2Wealth.WalletService.dtos.request.GetKeyRequest;
import org.springframework.stereotype.Service;

@Service
public class GetPrivateKeyServiceImpl implements GetPrivateKeyService {


    @Override
    public String getPrivateKey(GetKeyRequest getKeyRequest) {
        if(getKeyRequest.getWalletPassword().isEmpty()) throw new IllegalArgumentException("Wallet password cannot be empty");
        if(getKeyRequest.getUserId().isEmpty()) throw new IllegalArgumentException("User id cannot be empty");


        return "";
    }
}
