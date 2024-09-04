public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //task 2
        System.out.println("Task 2");

        int os = 1;
        int clientDeviceYear = 1999;
        if (clientDeviceYear <= 2014 && os == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2014 && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //task
        System.out.println("Task 3");

        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным. ");
        } else {
            System.out.println(year + " год не является високосным. ");
        }

        //task 4
        System.out.println("Task 4");

        int deliveryDistance = 22;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки. ");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня для доставки. ");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки. ");
        } else {
            System.out.println("Доставки нет.");
        }

        //task 5
        System.out.println("Task 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Неверно указан номер месяца.");
        }

        // task 6
        System.out.println("Task 6 ");

        int age = 10;
        int salary = 50000;
        if (age >= 23 && salary >= 80000){
            System.out.println(("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) * 1.5) + " рублей");
        } else if (age >= 23 && salary >= 50000 && salary < 80000) {
            System.out.println(("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) * 1.2) + " рублей");
        } else{
            if (age < 23 && salary >= 80000) {
                System.out.println(("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) * 1.5) + " рублей");
            } else if (age < 23 && salary >= 50000 && salary < 80000) {
                System.out.println(("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) * 1.2) + " рублей");
            }
        }


    }
}