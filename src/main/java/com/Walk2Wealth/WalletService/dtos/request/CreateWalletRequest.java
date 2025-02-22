package com.Walk2Wealth.WalletService.dtos.request;



public class CreateWalletRequest {
    private String username;
    private String walletPin;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWalletPin() {
        return walletPin;
    }

    public void setWalletPin(String walletPin) {
        this.walletPin = walletPin;
    }
}
