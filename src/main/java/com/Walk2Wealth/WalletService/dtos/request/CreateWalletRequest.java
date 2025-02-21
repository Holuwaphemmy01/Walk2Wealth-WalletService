package com.Walk2Wealth.WalletService.dtos.request;

import lombok.Data;

@Data
public class CreateWalletRequest {
    private String username;
    private String walletPin;
}
