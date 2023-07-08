package dev.djigit.fliesmanagementsystem.entity;

import javax.annotation.PostConstruct;
import java.util.Random;

public class Coupon extends Entity {
    private Boolean isUsed;
    private Integer discount;

    public Coupon(Integer id, Boolean isUsed) {
        super(id);
        this.isUsed = isUsed;
    }

    @PostConstruct
    public void setDiscount() {
        int[] discounts = {10, 50, 60};
        this.discount = discounts[new Random().nextInt(2)];
    }
}
