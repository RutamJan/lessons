package io.jancorp.fitness;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Gym {
    private GymZone pool;
    private GymZone lift;
    private GymZone group;
    private Abonement[] clients;
    private int clientCount;

    public Gym(GymZone pool, GymZone lift, GymZone group, Abonement[] clients, int clientCount) {
        pool = new GymZone("Бассейн", true,false, true);
        lift = new GymZone("Тренажерный зал", false, true, true);
        group = new GymZone("Групповой зал", true, true, true);
        clients = new Abonement[60];
        clientCount = 0;
    }

    public void NewDay()    {
        pool.NewDay();
        lift.NewDay();
        group.NewDay();
    }

    public Abonement newAbonement()    {
        Scanner in = new Scanner(System.in);
        LocalDate regDate;
        int duration;
        Abonement abonement = null;
        while (true)    {
            System.out.println("Создание нового абонемента");
            System.out.println("Введите имя, фамилию, год рождения клиента через пробел");
            String clientInfo = in.nextLine();
            clientInfo = clientInfo.trim();
            String[] infoArray = clientInfo.split("\\s");
            if (infoArray.length == 3)  {
                int year = Integer.parseInt(infoArray[2]);
                Client client = new Client(infoArray[0], infoArray[1], year);
                System.out.println("Выберите тип абонемента:");
                System.out.println("1 - разовый");
                System.out.println("2 - дневной");
                System.out.println("3 - полный");
                int type = in.nextInt();
                System.out.println("Введите дату начала действия абонемента в формате ГГГГ-ММ-ДД");
                regDate = LocalDate.parse(in.nextLine());
                switch (type)   {
                    case 1:
                        abonement = new SingleAbonement(regDate, client);
                        break;
                    case 2:
                        System.out.println("Введите срок действия абонемента");
                        duration = in.nextInt();
                        abonement = new DailyAbonement(regDate, regDate.plusDays(duration), client);
                        break;
                    case 3:
                        System.out.println("Введите срок действия абонемента");
                        duration = in.nextInt();
                        abonement = new FullTimeAbonement(regDate, regDate.plusDays(duration), client);
                        break;
                    default:
                        continue;
                }
                return abonement;
            } else {
                return null;
            }

        }
    }

    public void visit(Abonement abonement) {
        Scanner in = new Scanner(System.in);
        if (abonement == null)  {
            return;
        }
        if (abonement.getRegEndDate().isBefore(LocalDate.now()) ||
            abonement.getRegDate().isAfter(LocalDate.now())) {
            System.out.println("Абонемент недействителен");
            return;
        }
        while (true)    {
            System.out.println("Выберите зал для посещения:");
            System.out.println("1 - бассейн");
            System.out.println("2 - тренажерный зал");
            System.out.println("3 - групповой зал");
            System.out.println("4 - выход");
            int zone = in.nextInt();
            switch (zone)   {
                case 1:
                    if (pool.appendClient(abonement))   {
                        System.out.println("Добро пожаловать");
                        System.out.println(abonement.getClient().getSurname() + " " +
                        abonement.getClient().getName() + " " + pool.getName() + " " +
                        LocalDate.now() + " " + LocalTime.now());
                    }
                    break;
                case 2:
                    if (lift.appendClient(abonement))   {
                        System.out.println("Добро пожаловать");
                        System.out.println(abonement.getClient().getSurname() + " " +
                                abonement.getClient().getName() + " " + lift.getName() + " " +
                                LocalDate.now() + " " + LocalTime.now());
                    }
                    break;
                case 3:
                    if (group.appendClient(abonement))  {
                        System.out.println("Добро пожаловать");
                        System.out.println(abonement.getClient().getSurname() + " " +
                                abonement.getClient().getName() + " " + group.getName() + " " +
                                LocalDate.now() + " " + LocalTime.now());
                    }
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        }

    }



}
