package dev.djigit.fliesmanagementsystem.entity;

import org.springframework.stereotype.Component;

public class Baggage extends Entity {
    private String name;

    public Baggage(Integer id, String name) {
        super(id);
        this.name = name;
    }
}
