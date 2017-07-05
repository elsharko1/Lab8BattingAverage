import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Mark on 7/5/2017.
 */
public class BattingStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int atBats = 0;
        //double basesEarned = 0;

        System.out.println("Please enter the number of At-bats: ");
            atBats = scan.nextInt();
            while (atBats < 0){
                System.out.println("Invalid input, please enter a valid number: ");
                atBats = scan.nextInt();

            }

        int[] arrSize = new int[atBats];

        //System.out.println(arrSize.length);

        for (int i = 0; i < arrSize.length; i++) {
            System.out.println("Please enter number of bases earned for each At-Bat " + (i + 1) + ": ");
            //variable for userInput
            System.out.println("0 - Strike-out" + "1 - single" + "2 - double" + "3 - triple" + "4 - homerun");
            int userNum = scan.nextInt();
            arrSize[i] = userNum;
            //validation for numbers entered
            while(userNum > 4 | userNum < 0){
                System.out.println("Invalid input, please enter a valid number:");
                userNum = scan.nextInt();
            }

        }

        double actualHits = 0;//hits variable is for batting average, will ignore 0
        for (int i = 0; i < arrSize.length; i++) {
            //this will ignore strike outs because it will ignore 0.
            if (arrSize[i] < 1) {
            } else {
                actualHits = actualHits + 1;

            }
        }
        double basesTotal = 0;//sum of all the numbers in the array of value of atBats looking at actual number they
        //put in
        for (int j = 0; j < arrSize.length; j++) {
            basesTotal += arrSize[j];

            //put while loop inside  for loop  that says is number for valkue is greater than 4(homerun)
            //doesnt work
            //while(numofBases > 4 | numofBases < 0 ){
            //System.out.println("invalid input pleasse try again");
            //numofBases = scan.nextInt();
            //}
            //basesTotal += batsArray is also basesTotal = basesTotal + batsArray[i];
            //list the bat values on a print statement
            //do my calculations in this loop
            //for (int j : arrSize) {
            //System.out.println(i);
        }
        double batAvg = actualHits/atBats;
        double slugPercent = basesTotal/atBats;

        System.out.printf("Your batting average is: " + "%.3f" , batAvg);
        System.out.println();
        System.out.printf("Your slug percentage is: " + "%.3f", slugPercent);
        /*System.out.printf("%.3f", batAvg);
        System.out.println();
        System.out.println("Your slug percentage is: ");
        System.out.printf("%.3f" , slugPercent);
        */

        //now I need to set the value for each index at 0 1 2 3 for out single double trple homerun...

        //something divided by array length is the average.

        //int[] basesEarned = {0, 1, 2, 3, 4}???
        //dont forget to ignore the 0 if its an out when computing the batting average but dont ignore
        //with slugging percentage

        //need a bases earned variable that goes along with the times at bat variable


/*Jagged 2D example
        int[][] arr2 = new int[5][];
        //arr2[0][0] = 34;
        //arr2[1][0] = 55;

        //try to line up values so you can see it easier
        int[][] numbers = {{1, 2, 4, 6, 7},
                {4, 6, 8, 9, 12, 45},
                {56, 65}};

        int sum = 0;
        for (int [] row: numbers){
            //this is an array of arrays
            //set an array for each type then move through them
            for(int column : row){
                sum += column;

            }
            */

        /*//prompt user to enter a numnber based on size of array they gave me
        //assigning user entered values to the index positions
       private static void fillArray(Scanner scan, int[] arr) {
           for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter a number for index " + i +": ");
            //variable for userInput
            int userNum = scan.nextInt();
            arr[i] = userNum;

        }
        */


    }
}
