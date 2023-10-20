public class Main {
    public static void main(String[] args) {

        System.out.println("Расчёт бонусов за пополнение связи");
        System.out.println("Клиент 1");

        int amount = 100; //  изначально было на счету 100 рублей
        int refill = 300; // сумма пополнение счёта

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

            System.out.println("Количество бонусных рублей: " +bonus);

            System.out.println("Итоговый расчёт: " + (amount + refill + bonus));

        System.out.println("Расчёт бонусов за пополнение");
        System.out.println("Клиент 2");

        int balance = 100; //  изначально было на счету 100 рублей
        int phone_top_up = 1100; // сумма пополнение счёта


        if (phone_top_up > 1000) {
            bonus = phone_top_up / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Количество бонусных рублей: " +bonus);

        System.out.println("Итоговый расчёт: " + (balance + phone_top_up + bonus));
        }
    }