package com.github.vovaklimov.hotel.core.entities;

import com.github.vovaklimov.hotel.core.values.TimeRange;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
public class Booking extends EntityWithId<Long> {
    protected Booking() {
    }

    private Long clientId;
    private Long roomId;
    @Embedded
    TimeRange timeRange;

    public Booking(Long clientId, Long roomId, TimeRange timeRange) {
        this.clientId = clientId;
        this.roomId = roomId;
        this.timeRange = timeRange;
    }

    public Booking(Long clientId, Long roomId, Duration bookingDuration) {
        this.clientId = clientId;
        this.roomId = roomId;
        var bookingStart = LocalDateTime.now();
        var bookingEnd = bookingStart.plusDays(bookingDuration.toDays());
        this.timeRange = TimeRange.between(bookingStart, bookingEnd);
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }
}
