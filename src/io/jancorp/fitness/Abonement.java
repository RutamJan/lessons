package io.jancorp.fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class Abonement {
    private LocalDate regDate;
    private LocalDate regEndDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private Client client;
    private String type;

    public Abonement(LocalDate regDate, LocalDate regEndDate, LocalTime startTime, LocalTime endTime, Client client, String type) {
        setRegDate(regDate);
        setRegEndDate(regEndDate);
        setStartTime(startTime);
        setEndTime(endTime);
        this.client = client;
        setType(type);
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        if (null != regDate && regDate.isBefore(LocalDate.now())) {
            this.regDate = regDate;
        }
    }

    public LocalDate getRegEndDate() {
        return regEndDate;
    }

    public void setRegEndDate(LocalDate regEndDate) {
        if (null != regEndDate && regEndDate.isAfter(LocalDate.now())) {
            this.regEndDate = regEndDate;
        }
    }
    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        if (null != startTime) {
            this.startTime = startTime;
        }
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        if (null!= endTime) {
            this.endTime = endTime;
        }
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if ("Разовый".equals(type) || "Дневной".equals(type) || "Полный".equals(type)) {
            this.type = type;
        }
    }
}
