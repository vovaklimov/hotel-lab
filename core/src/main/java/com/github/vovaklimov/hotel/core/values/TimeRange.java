package com.github.vovaklimov.hotel.core.values;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDateTime;

@XmlAccessorType(XmlAccessType.PROPERTY)
@Embeddable
public class TimeRange {
    @Column(name = "fromDate")
    private LocalDateTime from;

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    @Column(name = "toDate")
    private LocalDateTime to;

    public TimeRange(LocalDateTime from, LocalDateTime to) {
        if (from.isAfter(to)) {
            throw new IllegalArgumentException("TimeRange start is after end");
        }

        this.from = from;
        this.to = to;
    }

    protected TimeRange() {
    }

    public static TimeRange between(LocalDateTime from, LocalDateTime to) {
        return new TimeRange(from, to);
    }

    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    public LocalDateTime getFrom() {
        return from;
    }

    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
    public LocalDateTime getTo() {
        return to;
    }
}
