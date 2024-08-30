public class Main {
    public static void main(String[] args) {
        System.out.println();

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int os = 1;
        int clientDeviceYear = 1999;
        if (clientDeviceYear <= 2014 && os == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2014 && os == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        int year = 2023;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println( year + " год является високосным. ");
        }else {
            System.out.println(year + " год не является високосным. ");
        }

        int deliveryDistance = 22;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день для доставки. ");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется 2 дня для доставки. ");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100){
            System.out.println("Потребуется 3 дня для доставки. ");
        } else {
            System.out.println("Доставки нет.");
        }

        int monthNumber = 12;
        switch (monthNumber){
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
    }
}