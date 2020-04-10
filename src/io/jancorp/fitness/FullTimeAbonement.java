package io.jancorp.fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class FullTimeAbonement extends Abonement {

    public FullTimeAbonement(LocalDate regDate, LocalDate regEndDate, Client client) {
        super(regDate, regEndDate, LocalTime.of(8, 0), LocalTime.of(22,0), client, "Полный");
    }
}
