public class Main {
    public static void offer(int billBalance, int replenishment) {
        int accountStatus = 100;
        int limit = 1000;
        if (replenishment >= limit) {
            int bonus = replenishment / accountStatus;
            billBalance += replenishment + bonus;
            System.out.println(" Поздравляем! Вы получули " + bonus + " бонусных рублей. ");
        } else {
            billBalance += replenishment;
            System.out.println(" Бонусы не будут начислены. ");
        }
        System.out.println(" Пополнение на " + replenishment + " рублей.");
        System.out.println(" Сумма вашего баланса " + billBalance + " Рублей. ");
    }
    public static void main(String[] args) {
        offer(100, 1000);
        offer(100, 100);
        }
    }