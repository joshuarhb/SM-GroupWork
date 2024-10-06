package com.RentFast.App.Billing;

import java.util.UUID;

public class Promotion {
    private final String promotionId = UUID.randomUUID().toString();
    private String userId;
    private String promotionType;
    private int discount;

    public Promotion(String userId, String promotionType, int discount) {
        this.userId = userId;
        this.promotionType = promotionType;
        this.discount = discount;
    }
}
