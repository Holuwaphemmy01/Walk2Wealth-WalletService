package com.Walk2Wealth.WalletService.service.get_private_key;


import com.Walk2Wealth.WalletService.dtos.request.GetKeyRequest;
import com.Walk2Wealth.WalletService.model.Wallet;
import com.Walk2Wealth.WalletService.repository.WalletRepository;
import com.Walk2Wealth.WalletService.service.encryptAndDecrypt.EncryptionAndDecryption;
import com.Walk2Wealth.WalletService.service.hashPassword.HashPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetPrivateKeyServiceImpl implements GetPrivateKeyService {

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private HashPassword hashPassword;


    @Override
    public String getPrivateKey(GetKeyRequest getKeyRequest) throws Exception {
        if(getKeyRequest.getUserId().isEmpty()) throw new IllegalArgumentException("User id cannot be empty");
        if(getKeyRequest.getWalletPassword().isEmpty()) throw new IllegalArgumentException("Wallet password cannot be empty");
        Wallet [] user = walletRepository.findWalletByUsername(getKeyRequest.getUserId());
        if(user.length == 0) throw new IllegalArgumentException("User not found");
        if(!hashPassword.checkPassword(getKeyRequest.getWalletPassword(), user[0].getWalletPassword())) throw new IllegalArgumentException("Wrong password");
        return EncryptionAndDecryption.decryptPrivateKey(user[0].getPrivateKey(), user[0].getWalletPassword());
    }


}
