package dev.djigit.fliesmanagementsystem.dao;

import dev.djigit.fliesmanagementsystem.entity.Location;

import java.util.Optional;

public interface LocationDao {
    Optional<Location> getLocationById(Integer id);
}
