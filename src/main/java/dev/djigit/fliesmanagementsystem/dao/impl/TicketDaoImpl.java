package dev.djigit.fliesmanagementsystem.dao.impl;

import dev.djigit.fliesmanagementsystem.dao.TicketDao;
import dev.djigit.fliesmanagementsystem.db.Database;
import dev.djigit.fliesmanagementsystem.entity.Ticket;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TicketDaoImpl implements TicketDao {
    private final Database database;

    public TicketDaoImpl(Database database) {
        this.database = database;
    }

    @Override
    public Optional<Ticket> getTicketById(Integer id) {
        return database.getTicketById(id);
    }
}
