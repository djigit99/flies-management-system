package dev.djigit.fliesmanagementsystem.dao;

import dev.djigit.fliesmanagementsystem.entity.Coupon;

import java.util.Optional;

public interface CouponDao {
    Optional<Coupon> getCouponById(Integer id);
}
