package com.github.vovaklimov.hotel.server.jaxws.dto;

import com.github.vovaklimov.hotel.core.values.LocalDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.FIELD)
public class CreateBookingDTO {
    public CreateBookingDTO(Long roomId, Long clientId, LocalDateTime fromDate, LocalDateTime toDate) {
        this.roomId = roomId;
        this.clientId = clientId;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public LocalDateTime getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDateTime fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDateTime getToDate() {
        return toDate;
    }

    public void setToDate(LocalDateTime toDate) {
        this.toDate = toDate;
    }

    public CreateBookingDTO() {
    }

    private Long roomId;
    private Long clientId;
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    private LocalDateTime fromDate;
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    private LocalDateTime toDate;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
