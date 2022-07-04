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
        System.out.println("Delivery will take " + numberOfDays + " days.");

    }

    public static void printIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void printApplicationVersion (int a, int b) {
        int currentYear = LocalDate.now().getYear();
        if (a == 1) {
            if (b < currentYear) {
                System.out.println("Install Android lite version of the app here");
            } else {
                System.out.println("Install Android version of the app here");
            }
        } else {
            if (b < currentYear) {
                System.out.println("Install iOS lite version of the app here");
            } else {
                System.out.println("Install iOS of the app version here");
            }
        }
    }


    public static int calculateNumberOfDays (int distance) {
        int days = 0;
        if (distance >= 0 && distance < 40)
            days +=1;
        if (distance >= 40 && distance < 60)
            days +=1;
        if (distance >= 60 && distance < 80)
            days +=1;

        return days;

    }

}