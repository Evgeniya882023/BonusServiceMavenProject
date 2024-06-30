package ru.netology;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 100;
        boolean registered = true;
        long actual = service.calculate(amount, registered);
        System.out.println(actual);
    }
}