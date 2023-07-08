package dev.djigit.fliesmanagementsystem.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CouponServiceTest {
    private CouponService couponService;

    @BeforeEach
    void setUp() {
        couponService = new CouponService();
    }

    @Test
    void getTicketNewPrice_Test() {
        double startPrice = 10.0;
        double discount = 0.60;
        Double expectedPrice = 4.;
        Double actualPrice = couponService.getTicketNewPrice(startPrice, discount);
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void getTicketNewPriceWithRoundedValue_Test() {
        double startPrice = 9.39;
        double discount = 0.60;
        Double expectedPrice = 3.76;
        Double actualPrice = couponService.getTicketNewPrice(startPrice, discount);
        assertEquals(expectedPrice, actualPrice);
    }
}
