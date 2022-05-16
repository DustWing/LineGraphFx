package com.example.linegraphfx.model;

import java.time.LocalDateTime;

public class Exposure {
    private LocalDateTime localDateTime;
    private Long amount;

    public Exposure(LocalDateTime localDateTime, Long amount) {
        this.localDateTime = localDateTime;
        this.amount = amount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
