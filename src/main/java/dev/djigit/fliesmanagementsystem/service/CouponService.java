package dev.djigit.fliesmanagementsystem.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Service
public class CouponService {
    public Double getTicketNewPrice(double startPrice, double discount) {
        BigDecimal ticketNewPrice = new BigDecimal(startPrice * (1.0 - discount));
        ticketNewPrice = ticketNewPrice.setScale(2, RoundingMode.UP);
        return ticketNewPrice.doubleValue();
    }
}
