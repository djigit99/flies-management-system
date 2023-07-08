package dev.djigit.fliesmanagementsystem.db;

import dev.djigit.fliesmanagementsystem.entity.Baggage;
import dev.djigit.fliesmanagementsystem.entity.Coupon;
import dev.djigit.fliesmanagementsystem.entity.Location;
import dev.djigit.fliesmanagementsystem.entity.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class Database {
    private static final Logger LOGGER = LoggerFactory.getLogger(Database.class);
    private final Map<Integer, Ticket> ticketMap;
    private final Map<Integer, Baggage> baggageMap;
    private final Map<Integer, Coupon> couponMap;
    private final Map<Integer, Location> locationMap;

    public Database() {
        ticketMap = new HashMap<>();
        baggageMap = new HashMap<>();
        locationMap = new HashMap<>();
        couponMap = new HashMap<>();
    }

    @PostConstruct
    public void initDB() {
        LOGGER.debug("Initializing data into database...");
        ticketMap.put(1, new Ticket(1, true));
        ticketMap.put(2, new Ticket(2, true));
        ticketMap.put(3, new Ticket(3, false));
        ticketMap.put(4, new Ticket(4, false));

        baggageMap.put(1, new Baggage(1, "Big-size baggage 5kg"));
        baggageMap.put(2, new Baggage(2, "Small-size baggage 1kg"));
        baggageMap.put(3, new Baggage(3, "Medium-size baggage 3kg"));

        locationMap.put(1, new Location(1, "Kyiv"));
        locationMap.put(2, new Location(2, "Lviv"));
        locationMap.put(3, new Location(3, "Paris"));
        locationMap.put(4, new Location(4, "Madrid"));

        couponMap.put(1, new Coupon(1, false));
        couponMap.put(2, new Coupon(2, true));
        couponMap.put(3, new Coupon(3, false));
        couponMap.put(4, new Coupon(4, false));
    }

    public Optional<Ticket> getTicketById(Integer id) {
        LOGGER.debug("Imitating database search..");
        if (ticketMap.containsKey(id))
            return Optional.of(ticketMap.get(id));
        return Optional.empty();
    }

    public Optional<Baggage> getBaggageById(Integer id) {
        LOGGER.debug("Imitating database search..");
        if (baggageMap.containsKey(id))
            return Optional.of(baggageMap.get(id));
        return Optional.empty();
    }

    public Optional<Location> getLocationById(Integer id) {
        LOGGER.debug("Imitating database search..");
        if (locationMap.containsKey(id))
            return Optional.of(locationMap.get(id));
        return Optional.empty();
    }

    public Optional<Coupon> getCouponById(Integer id) {
        LOGGER.debug("Imitating database search..");
        if (couponMap.containsKey(id))
            return Optional.of(couponMap.get(id));
        return Optional.empty();
    }
}
