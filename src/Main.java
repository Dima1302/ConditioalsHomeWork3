public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task5();
        task4();
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        }
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        }
    }

    public static void task2() {
        int phoneProduced = 2012;
        int clientOS = 1;
        if (phoneProduced >= 2015) {
            System.out.println(" Приложение будет работать корректно ");
        } else if (phoneProduced < 2015) {
            System.out.println(" Установите облегченную версию приложения ");
        }
        if (phoneProduced < 2015 && clientOS == 0) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке  ");
        } else if (phoneProduced < 2015 && clientOS == 1) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }
    }

    public static void task3() {
        int year = 2020;
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    public static void task4() {
        int deliveryIncrease = 40;
        int oneDayDelivery = 20;
        int deliveryDistance = 1000;
        int deliveryTime = 1;

        if (deliveryDistance >= oneDayDelivery) {
            deliveryTime += deliveryDistance / deliveryIncrease;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static void task5() {
        int monthNumber = 14;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
            case 2:
                System.out.println("Февраль");
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
            case 6:
                System.out.println("Июнь");
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
            case 9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
            case 11:
                System.out.println("Ноябрь");
            case 12:
                System.out.println("Декабрь");
            default:
                System.out.println("Неправильно указан месяц");
        }
    }
    public static void task6() {
  int age = 19;
  int salary = 58_000;
  int maxLimit = 0;

  if (age >= 23) {
      maxLimit = salary * 3;
  } else {
  maxLimit = salary *2;
  } if (salary >= 50_000 && salary < 80_000) {
      maxLimit = (int) (maxLimit * 1.2);
  } else if(salary > 80_000) {
      maxLimit = (int) (maxLimit *1.5);

  }
        System.out.println(" Мы готовы выдать вам кредитную карту с " + maxLimit +  " лимитом рублей");
    }
    public static void task7() {
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        double baseRate = 0.1;
        int loanTerms = 12;
        int maxMonthlyPayment = salary/2;
        int amountPerYear = (int) (wantedSum + wantedSum * baseRate);
        int averageMonthlyPayment = amountPerYear / loanTerms;
        if (age < 23) {
            baseRate = baseRate + 0.01;
        } else if (age < 30) {
            baseRate = baseRate + 0.005;

        } if (salary > 80_000) {
            baseRate = baseRate - 0.007; // не совсем понял как учесть ставку.Кажется у меня она не учитывается.
        }
        if( maxMonthlyPayment > averageMonthlyPayment) {
            System.out.println(" Максимальный платеж при ЗП равен " + maxMonthlyPayment +  " рублей. Платеж по кредиту " + averageMonthlyPayment +  "рублей. Одобрено ");
        } else {
            System.out.println(" Максимальный платеж при ЗП равен " + maxMonthlyPayment +  " рублей. Платеж по кредиту " + averageMonthlyPayment +  "рублей. Отказано ");
        }

    }


}