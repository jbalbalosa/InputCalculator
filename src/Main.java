import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input Calculator!");
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        long avg = 0;

        while(true){
            try {
                sum += Integer.parseInt(scanner.nextLine());
                counter++;
                avg =  Math.round((double) sum / counter);

            } catch (NumberFormatException nfe){
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();



        /*------------------------------*/

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//        long avg = 0;
//
//        while (true) {
//            boolean hasNextInt = scanner.hasNextInt();
//            if (!hasNextInt) {
//                // break the loop on invalid input
//                break;
//            }
//            sum += scanner.nextInt();
//            count++;
//            // clear buffer e.g. remove line separator
//            scanner.nextLine();
//        }
//
//        if (count > 0) {
//            avg = Math.round((double) sum / count);
//        }
//
//        System.out.println("SUM = " + sum + " AVG = " + avg);
//        scanner.close();
    }
}