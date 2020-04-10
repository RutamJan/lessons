package io.jancorp.fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class SingleAbonement extends Abonement{

    public SingleAbonement(LocalDate regDate, Client client) {
        super(regDate, regDate, LocalTime.of(8, 0), LocalTime.of(22,0), client, "Разовый");
    }
}
