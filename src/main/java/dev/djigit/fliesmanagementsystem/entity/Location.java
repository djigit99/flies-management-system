package dev.djigit.fliesmanagementsystem.entity;

public class Location extends Entity {
    private String name;

    public Location(Integer id, String name) {
        super(id);
        this.name = name;
    }
}
