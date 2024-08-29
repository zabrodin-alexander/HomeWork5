public class Main {
    public static void main(String[] args) {
        System.out.println();

        int clientOs = 1;
        int clientDeviceYear = 1999;
        if (clientDeviceYear <= 2014) {
            if (clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке. ");
            } else if (clientOs == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке. ");
            }
        } else {
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке. ");
            } else if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке. ");
            }
        }

        int year = 2024;
        if (year % 4 == 0 ) {
            System.out.println("Год високосный.");
        } else if (year % 100 != 0) {
            System.out.println("Год не високосный. ");
        }else  if ( year % 400 == 0){
            System.out.println("Год високосный.");
        }

        int deliveryDistance = 123;
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