public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        int iOS = 1;
        int android = 0;
        if (iOS == clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (android == clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Устройство не опознано ");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2019;
        int iOS = 1;
        int android = 0;
        int clientOS = 0;
        if (iOS == clientOS) {
            if(clientDeviceYear > 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (android==clientOS) {
                if (clientDeviceYear>2015) {
                    System.out.println("Установите обычную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Является високосным годом");
        } else {
            System.out.println(year + " не является високосным годом");

        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (20 > deliveryDistance) {
            System.out.println("Срок доставки 1 день");
        } else if (20<deliveryDistance && deliveryDistance<=60) {
            System.out.println("Срок доставки 2 дня");
        } else if (60<deliveryDistance && deliveryDistance<=100) {
            System.out.println("Срок доставки 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 3;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}