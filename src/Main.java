public class Main {

    public static void main(String[] args) {

        int ticket = 1000; // стоимость билета
        int mile = 20; // кол-во рублей для 1 бонусной мили
        int result = ticket / mile;
        int bonus = 50; // кол-во бунысных миль

        System.out.println("Количество бонусных миль:" + result);
    }
}