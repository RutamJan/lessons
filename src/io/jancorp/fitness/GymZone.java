package io.jancorp.fitness;

import java.time.LocalTime;

public class GymZone {
    private String name;
    private Abonement[] clients;
    private boolean singleFlag;
    private boolean dailyFlag;
    private boolean fullFlag;
    private int counter;

    public GymZone(String name, boolean singleFlag, boolean dailyFlag, boolean fullFlag) {
        setName(name);
        clients = new Abonement[20];
        this.singleFlag = singleFlag;
        this.dailyFlag = dailyFlag;
        this.fullFlag = fullFlag;
        counter = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (null != name) {
            this.name = name;
        }
    }

    public void NewDay()    {
        clients = new Abonement[20];
        counter = 0;
    }

    public boolean appendClient(Abonement client)  {
        boolean result = false;
        if (client == null) {
            System.out.println("Ошибка! Неправильный ввод данных");
            return false;
        }
        if (singleFlag == false && client instanceof SingleAbonement ||
            dailyFlag == false  && client instanceof DailyAbonement ||
            fullFlag == false   && client instanceof FullTimeAbonement)   {
            System.out.println("Данная зона недоступна для клиента");
            return false;
        }
        if (client.getStartTime().isAfter(LocalTime.now()) ||
            client.getEndTime().isBefore(LocalTime.now()))  {
            System.out.println("Посещение невозможно в данное время");
            return false;
        } else if (counter < 20)    {
            clients[counter++] = client;
            result = true;
        } else  {
            System.out.println("Превышено допустимое кол-во посетителей");
            return false;
        }
        return result;
    }



}
