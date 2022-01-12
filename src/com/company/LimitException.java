package com.company;

public class LimitException extends Throwable {
    private String massage;
    private Double remainingAmount;

    public LimitException(String massage, Double remainingAmount) {
        this.massage = massage;
        this.remainingAmount = remainingAmount;
    }

    public String getMassage() {
        return massage;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }
}
