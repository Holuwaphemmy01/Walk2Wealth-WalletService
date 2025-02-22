package com.Walk2Wealth.WalletService.service.get_private_key;

import com.Walk2Wealth.WalletService.dtos.request.GetKeyRequest;

public interface GetPrivateKeyService {

    String getPrivateKey(GetKeyRequest getKeyRequest) throws Exception;
}
