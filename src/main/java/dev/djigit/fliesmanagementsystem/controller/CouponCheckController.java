package dev.djigit.fliesmanagementsystem.controller;

import dev.djigit.fliesmanagementsystem.dao.CouponDao;
import dev.djigit.fliesmanagementsystem.entity.Coupon;
import dev.djigit.fliesmanagementsystem.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CouponCheckController {
    @Autowired
    private CouponDao couponDao;
    @Autowired
    private CouponService couponService;

    @GetMapping("/coupon")
    public ResponseEntity<Object> doCoupon(@RequestParam Integer couponId, @RequestParam Double ticketPrice) {
        if (ticketPrice <= 0)
            return new ResponseEntity<>("Ticket price must be a positive number", HttpStatus.BAD_REQUEST);
        Optional<Coupon> coupon = couponDao.getCouponById(couponId);
        if (coupon.isEmpty())
            return new ResponseEntity<>("Coupon not found", HttpStatus.NOT_FOUND);

        Double ticketNewPrice = couponService.getTicketNewPrice(ticketPrice, coupon.get().getDiscount());
        return new ResponseEntity<>(ticketNewPrice, HttpStatus.OK);
    }
}
