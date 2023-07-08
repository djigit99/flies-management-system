package dev.djigit.fliesmanagementsystem.controller;

import dev.djigit.fliesmanagementsystem.dao.TicketDao;
import dev.djigit.fliesmanagementsystem.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TicketController {
    @Autowired
    private TicketDao ticketDao;

    @GetMapping("/ticket")
    @ResponseStatus(HttpStatus.OK)
    public Boolean checkTicket(@RequestParam Integer ticketId) {
        Optional<Ticket> ticket = ticketDao.getTicketById(ticketId);
        if(ticket.isEmpty())
            return false;
        return ticket.get().isFree();
    }
}
