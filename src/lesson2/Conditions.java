package lesson2;

public class Conditions {
    //    psvm
    public static void main(String[] args) {
        // if else
        /*if (условие) {
            код выполнится, если условие true;
        } else if (условие2) {
            код выполнится, если условие2 true;
        } else {
            код выполнится, если все условия false;
        }*/
        // в переменной minute лежит число от 0 до 59
        // В какую четверть часа попадает данное число
        // Ответ в консоль
//        0 - 14 => "Первая четверть"
//        15 - 30 => "Вторая четверть"
//        31 - 45 => "Третья четверть"
//        46 - 59 => "Четвертая четверть"
        int minute = 34;
        if (minute >= 0 && minute <= 14) {
            System.out.println("Первая четверть");
        } else if (minute >= 15 && minute <= 30) {
            System.out.println("Вторая четверть");
        } else if (minute >= 31 && minute <= 45) {
            System.out.println("Третья четверть");
        } else if (minute >= 46 && minute <= 59) {
            System.out.println("Четвертая четверть");
        } else {
            System.out.println("Вне диапазона");
        }

//        switch () {}
        int code = 222;
        // 111 / 222 / 333 -> "Малый приз"
        // 444 / 555  -> "Средний приз"
        // 777  -> "Крупный приз"
        //   -> "Попробуйте еще раз"
        switch (code) {
            case 111:
            case 222:
            case 333:
                System.out.println("Малый приз");
                break;
            case 444:
            case 555:
                System.out.println("Средний приз");
                break;
            case 777:
                System.out.println("Крупный приз");
                break;
            default:
                System.out.println("Попробуйте еще раз");
        }

        // switch 12 / 13
        code = 123;
//        switch (code) {
//            case 111, 222, 333 -> System.out.println("Малый приз");
//            case 444, 555 -> System.out.println("Средний приз");
//            case 777 -> System.out.println("Крупный приз");
//            default -> System.out.println("Попробуйте еще раз");
//        }

        code = 333;
//        String prize = switch (code) {
//            case 111, 222, 333 -> "Малый приз";
////            case 444, 555 -> "Средний приз";
////            case 777 -> "Крупный приз";
//            default -> "Попробуйте еще раз";
//        };
//
//        prize = switch (code) {
//            case 111, 222, 333 -> "Малый приз";
////            case 444, 555 -> "Средний приз";
////            case 777 -> "Крупный приз";
//            default -> {
//                String someRes = "Попробуйте еще раз";
//                yield someRes; // J13
////                break someRes; // J12
//            }
//        };
//        System.out.println(prize);
    }
}
