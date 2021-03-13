public class Main {
    public static void offer(int bill_balance, int replenishment) {
        int account_status = 100;
        int limit = 1000;
        if (replenishment >= limit) {
            int bonus = replenishment / account_status;
            bill_balance += replenishment + bonus;
            System.out.println(" Пополнение на " + replenishment + " рублей.");
            System.out.println(" Поздравляем! Вы получули " + bonus + " бонусных рублей. ");
            System.out.println(" Сумма вашего баланса " + bill_balance + " Рублей. ");
        } else {
            bill_balance += replenishment;
            System.out.println(" Пополнение на " + replenishment + " рублей ");
            System.out.println(" Бонусы не будут начислены. ");
            System.out.println(" Баланс вашего счета: " + bill_balance + " рублей. ");
        }
    }
        public static void main(String[] args) {
            offer(100, 1000);
            offer(100, 100);
        }
    }
