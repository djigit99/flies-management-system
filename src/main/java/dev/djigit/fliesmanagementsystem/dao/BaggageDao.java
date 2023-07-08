package dev.djigit.fliesmanagementsystem.dao;

import dev.djigit.fliesmanagementsystem.entity.Baggage;

import java.util.Optional;

public interface BaggageDao {
    Optional<Baggage> getBaggageById(Integer id);
}
