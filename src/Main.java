public class Main {
    public static void main(String[] args) {
        int balance = 1000; //имеющийся баланс
        int moneyAdded = 2400; //сумма пополнения телефона
        int bonusRub = 0; //бонусы
        Boolean client = true; //условие - пользователь наш клиент

        if (moneyAdded > 1000) {
            bonusRub = (moneyAdded / 100);
        }
        int finalBalance = (bonusRub + moneyAdded + balance);//формула вывода финального баланса с бонусами
        System.out.println("Общая сумма начисления с бонусами " + finalBalance);
        System.out.println("Сумма начисления бонусов " + bonusRub);
    }

}