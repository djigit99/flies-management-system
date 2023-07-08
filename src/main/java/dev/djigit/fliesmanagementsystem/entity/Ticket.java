package dev.djigit.fliesmanagementsystem.entity;

public class Ticket extends Entity {
    private Boolean isFree;

    public Ticket(Integer id, Boolean isFree) {
        super(id);
        this.isFree = isFree;
    }

    public Boolean isFree() {
        return isFree;
    }
}
