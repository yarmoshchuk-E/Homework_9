public class Main {
    public static void main(String[] args) {

        System.out.println("Task_1");
        int firstFriday = 4;
        for (int date = 1; date <= 31; date++) {
            if ((date - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        System.out.println("Task_2-1");
        int distance = 0;
        do {
            System.out.println("Держись! Осталось " + (42195 - distance) + " метров.");
            distance += 500;
        } while (distance <= 42195);
        System.out.println();

        System.out.println("Task_2-2");
        for (int distanceTraveled = 0; distanceTraveled <= 42195; distanceTraveled += 500) {
            System.out.println("Держись! Осталось " + (42195 - distanceTraveled) + " метров.");
        }
        System.out.println();

        System.out.println("Task_3-1");
        int money = 1500;   //внесённая сумма
        int days = 0;       //расчётное время парковки
        if (money < 100) {
            System.out.println("Недостаточно средств.");
        } else {
            while (money >= 100) {
                days++;
                if (days % 5 == 0) {
                    continue;
                }
                money -= 100;
            }
            System.out.println("Вы можете оставить автомобиль на " + days + " дней.");
        }
        System.out.println();

        System.out.println("Task_3-2");
        int moneyParking = 1500;  //внесенная сумма
        int daysParking = 0;      //расчётное время парковки
        if (moneyParking < 100) {
            System.out.println("Недостаточно средств.");
        } else {
            for (; moneyParking >= 100; ) {
                daysParking++;
                if (daysParking % 5 == 0) {
                    continue;
                }
                moneyParking -= 100;
            }
            System.out.println("Вы можете оставить автомобиль на " + daysParking + " дней.");
        }
        System.out.println();

        System.out.println("Task_4");
        double total = 0;
        int month = 0;
        while (true) {
            month++;
            if (month % 6 == 0) {
                total = total + (total / 100 * 7);  //добавляем 7% к уже накопленной сумме на 6-м месяце
                total = total + 15000;
            } else {
                total = total + 15000;
            }
            System.out.printf("Ваши накопления за " + month + " месяцев составили " + "%.2f рублей.%n", total);
            if (total >= 12000000) {
                break;
            }
        }
        System.out.println();

        System.out.println("Task_5");
        int charge = 20;
        int minute = 0;
        int overheat = 0;
        while (charge < 100 && overheat <= 3) {
            if (minute % 10 == 0 && minute != 0) {
                overheat++;
                minute += 2;
                System.out.println("Зарядка прекращена. Текущий заряд " + charge + " %.");
                continue;
            }
            minute++;
            charge += 2;
            if (overheat == 3) {
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут(ы).");
    }
}