package ca.baskwo.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private int id;

    private LocalDateTime creationTime;

    private List<Merchandise> merchandises;

    public Order(int id, LocalDateTime creationTime, List<Merchandise> merchandises) {
        this.id = id;
        this.creationTime = creationTime;
        this.merchandises = merchandises;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public List<Merchandise> getMerchandises() {
        return merchandises;
    }

    public void setMerchandises(List<Merchandise> merchandises) {
        this.merchandises = merchandises;
    }
}
