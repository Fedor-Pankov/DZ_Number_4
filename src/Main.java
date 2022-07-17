public class Main {
    public static void main(String[] args) {
        //Первая задача:
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Вторая задача:
        int clientOS = 1;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Третья задача:
        int year = 2010;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Четвертая задача:
        int deliveryDistance = 59;
        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется 1 день");
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Для доставки потребуется 2 дня");
        } else if ((deliveryDistance >= 60) && (deliveryDistance <= 100)) {
            System.out.println("Для доставки потребуется 3 дня");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //Пятая задача:
        int monthNumber = 11;
        if ((monthNumber == 12) || (monthNumber >= 1) && (monthNumber <= 2)) {
            System.out.println("Сейчас зима");
        } else if ((monthNumber >= 3) && (monthNumber <= 5)) {
            System.out.println("Сейчас весна");
        } else if ((monthNumber >= 6) && (monthNumber <= 8)) {
            System.out.println("Сейчас лето");
        } else if ((monthNumber >= 9) && (monthNumber <= 11)) {
            System.out.println("Сейчас осень");
        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}