package dev.djigit.fliesmanagementsystem.dao.impl;

import dev.djigit.fliesmanagementsystem.dao.LocationDao;
import dev.djigit.fliesmanagementsystem.db.Database;
import dev.djigit.fliesmanagementsystem.entity.Location;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class LocationDaoImpl implements LocationDao {
    private final Database database;

    public LocationDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public Optional<Location> getLocationById(Integer id) {
        return database.getLocationById(id);
    }
}
