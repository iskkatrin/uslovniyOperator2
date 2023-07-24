public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

    int clientOS = 0;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

        System.out.println("Задание 2");

        int clientDeviceYear = 2015;
        int clientOS1 = 0;

        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        else if (clientOS1 != 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }



        System.out.println("Задание 3");

        int year = 2021;

        if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный год "); }
        else {
        System.out.println(year + " не високосный год "); }




        System.out.println("Задание 4");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает 1 сутки");
        }
        else if (20 <= deliveryDistance && deliveryDistance <= 60) {
            System.out.println("Доставка занимает 2 суток");
        }
        else if (60 <= deliveryDistance && deliveryDistance <= 100) {
            System.out.println("Доставка занимает 3 суток");
        } else {
                System.out.println("Доставки нет");
            }



        System.out.println("Задание 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;

            default:
                System.out.println("Некорректный номер месяца");
        }

    }
}