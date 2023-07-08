package dev.djigit.fliesmanagementsystem.entity;

import java.util.Random;

public class Coupon extends Entity {
    private Boolean isUsed;
    private double discount;

    public Coupon(Integer id, Boolean isUsed) {
        super(id);
        this.isUsed = isUsed;

        double[] discounts = {0.10, 0.50, 0.60};
        this.discount = discounts[new Random().nextInt(2)];
    }

    public double getDiscount() {
        return discount;
    }
}
