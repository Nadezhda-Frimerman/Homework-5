public class Main {
    public static void main(String[] args) {
        System.out.println("Execise 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Данная система не поддерживается");
        }

        System.out.println("Execise 2");
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Данная система не поддерживается");
        }

        System.out.println("Execise 3");
        int year = 1953;
        if (year > 1584 && (year %4 ==0 && year %100 != 0 || year %400 ==0)) {
            System.out.printf("%s год является високосным\n",year);}
        else {System.out.printf("%s год не является високосным\n",year);}

        System.out.println("Execise 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.printf("Для доставки потребуется %s дней\n",day);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.printf("Для доставки потребуется %s дней\n",day+1);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
           System.out.printf("Для доставки потребуется %s дней\n",day+2);
        }
        else {System.out.println("Доставки нет");
        }

        System.out.println("Execise 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("зима");
            case 3, 4, 5 -> System.out.println("весна");
            case 6, 7, 8 -> System.out.println("лето");
            case 9, 10, 11 -> System.out.println("осень");
            default -> System.out.println("номер месяца задан не корректно");
        }
    }
}