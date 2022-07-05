import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        int year = 1999;
        printIsLeapYear(year);


        int clientOS = 1;
        int clientDeviceYear = 2013;
        printApplicationVersion(clientOS, clientDeviceYear);

        int deliveryDistance = 100;
        int numberOfDays = calculateNumberOfDays(deliveryDistance);
        printDeliveryDays(numberOfDays);

    }

    public static void printDeliveryDays (int days) {
        System.out.println("Delivery will take " + days);
    }

    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void printApplicationVersion (int system, int year) {
        int currentYear = LocalDate.now().getYear();
        if (system == 1) {
            if (year > 2015 && year <= currentYear) {
                System.out.println("Install Android  version of the app here");
            } else {
                System.out.println("Install Android lite version of the app here");
            }
        } else {
            if (year > 2015 && year <= currentYear) {
                System.out.println("Install iOS version of the app here");
            } else {
                System.out.println("Install iOS lite version of the app here");
            }
        }
    }


    public static int calculateNumberOfDays (int distance) {
        int days = 0;
        if (distance >= 0 && distance < 20) {
            days += 1;
        }
        if (distance >= 20 && distance < 60) {
            days += 2;
        }
        if (distance >= 60 && distance < 100) {
            days += 3;
        }
        if (distance >= 100) {
            days += 4;
        }

        return days;

    }

}