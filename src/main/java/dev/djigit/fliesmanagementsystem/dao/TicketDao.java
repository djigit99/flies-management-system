package dev.djigit.fliesmanagementsystem.dao;

import dev.djigit.fliesmanagementsystem.entity.Ticket;

import java.util.Optional;

public interface TicketDao {
    Optional<Ticket> getTicketById(Integer id);
}
