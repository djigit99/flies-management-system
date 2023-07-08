package dev.djigit.fliesmanagementsystem.controller;

import dev.djigit.fliesmanagementsystem.dao.impl.BaggageDaoImpl;
import dev.djigit.fliesmanagementsystem.dao.impl.LocationDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckInController {
    @Autowired
    private BaggageDaoImpl baggageDao;
    @Autowired
    private LocationDaoImpl locationDao;

    @GetMapping("/checkin")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isCheckInSuccessful(@PathVariable Integer destinationId, @PathVariable Integer baggageId) {
        if (baggageDao.getBaggageById(baggageId).isEmpty())
            return false;
        if (locationDao.getLocationById(destinationId).isEmpty())
            return false;
        return true;
    }
}
