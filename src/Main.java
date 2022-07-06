public class Main {
    public static void main(String[] args) {

        System.out.println("Привет, это программа начисления бонусных мил.");
        int amount = 3250; // Стоимость билета

        int bonus = amount / 20;

        System.out.println("При стоимости билета: " + amount);
        System.out.println("Начислено миль: " + bonus);
    }
}
