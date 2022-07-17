public class Main {
    public static void main(String[] args) {
        //Первая задача:
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        }


        //Вторая задача:
        int client0S = 1;
        int clientDeviceYear = 2014;

        if (client0S == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (client0S == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (client0S == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (client0S == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //Третья задача:
        int year = 2010;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        //Четвертая задача:
        int deliveryDistance = 9;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется 1 день");
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Для доставки потребуется 2 дня");
        } else if ((deliveryDistance >= 60) && (deliveryDistance <= 100)) {
            System.out.println("Для доставки потребуется 3 дня");
        } else {
            System.out.println("Доставка не осуществляется");
        }


        //Пятая задача:
        int monthNumber = 7;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case  9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}