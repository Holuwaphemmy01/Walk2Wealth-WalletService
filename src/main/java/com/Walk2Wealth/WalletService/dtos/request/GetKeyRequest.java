package com.Walk2Wealth.WalletService.dtos.request;

public class GetKeyRequest {
    private String userId;
    private String walletPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWalletPassword() {
        return walletPassword;
    }

    public void setWalletPassword(String walletPassword) {
        this.walletPassword = walletPassword;
    }
}
