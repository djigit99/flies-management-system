package dev.djigit.fliesmanagementsystem.dao.impl;

import dev.djigit.fliesmanagementsystem.dao.CouponDao;
import dev.djigit.fliesmanagementsystem.db.Database;
import dev.djigit.fliesmanagementsystem.entity.Coupon;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CouponDaoImpl implements CouponDao {
    private final Database database;

    public CouponDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public Optional<Coupon> getCouponById(Integer id) {
        return database.getCouponById(id);
    }
}
