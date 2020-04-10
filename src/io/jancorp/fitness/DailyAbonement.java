package io.jancorp.fitness;

import java.time.LocalDate;
import java.time.LocalTime;

public class DailyAbonement extends Abonement {

    public DailyAbonement(LocalDate regDate, LocalDate regEndDate, Client client) {
        super(regDate, regEndDate, LocalTime.of(8, 0), LocalTime.of(16,0), client, "Дневной");
    }
}
