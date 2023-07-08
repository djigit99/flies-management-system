package dev.djigit.fliesmanagementsystem.entity;

import org.springframework.stereotype.Component;

@Component
public class Ticket extends Entity {
    private String name;
    private Integer fromId;
    private Integer destinationId;
    private Integer baggageId;

    public Ticket(Integer id, String name, Integer fromId, Integer destinationId, Integer baggageId) {
        super(id);
        this.name = name;
        this.fromId = fromId;
        this.destinationId = destinationId;
        this.baggageId = baggageId;
    }
}
