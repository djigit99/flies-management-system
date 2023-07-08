package dev.djigit.fliesmanagementsystem.db;

import dev.djigit.fliesmanagementsystem.entity.Baggage;
import dev.djigit.fliesmanagementsystem.entity.Coupon;
import dev.djigit.fliesmanagementsystem.entity.Ticket;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class Database {
    private Map<Integer, Ticket> ticketMap;
    private Map<Integer, Baggage> baggageMap;
    private Map<Integer, Coupon> couponMap;

    public Database() {
        ticketMap = new HashMap<>();
        baggageMap = new HashMap<>();
        couponMap = new HashMap<>();
    }

    @PostConstruct
    public void initDB() {
//        ticketMap.put(1, new Ticket(1, "Kyiv-Paris Djigit-Airlines", ))
    }
}
