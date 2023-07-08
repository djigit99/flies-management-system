package dev.djigit.fliesmanagementsystem.dao.impl;

import dev.djigit.fliesmanagementsystem.dao.BaggageDao;
import dev.djigit.fliesmanagementsystem.db.Database;
import dev.djigit.fliesmanagementsystem.entity.Baggage;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BaggageDaoImpl implements BaggageDao {

    private final Database database;

    public BaggageDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public Optional<Baggage> getBaggageById(Integer id) {
        return database.getBaggageById(id);
    }
}
