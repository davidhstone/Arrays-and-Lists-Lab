package ga.lab;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        String charString;
        double summedDoubles;
        int middleValue;

        stringLengthOrValue("wow");
        //Problem 1:
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");

        //Problem 2:
        reversedOrder();

        //Problem 3:
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});

        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        System.out.println(summedDoubles);


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(charString);

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        System.out.println(charString);

        charString = charsToString(new char[]{'I', ' ', 'a', 'm', ' '});
        System.out.println(charString);

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        System.out.println(charString);

        //Problem 6:
        List<String> myStringList = new ArrayList<>();
        myStringList.add("Clash");
        myStringList.add("Give");
        myStringList.add("Em");
        myStringList.add("Enough");
        myStringList.add("Rope");

        //Problem 7:
        reversedStringOrder(myStringList);        //use the List you created in problem 6);

        //Problem 8:
        printOrAdd(myStringList);                           // use the List you created in problem 6);

        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.

        int[] oddSizedArray = new int[5];
        oddSizedArray[0] = 111;
        oddSizedArray[1] = 222;
        oddSizedArray[2] = 123;
        oddSizedArray[3] = 222;
        oddSizedArray[4] = 123;


        findMiddle(oddSizedArray);

        /* //Problem 10:
        findMiddle(use the array you created in problem 9);
        //how do we print a variable to the command line

        findMiddle(new int[]{2,7,9,12,15});
        //how do we print a variable to the command line

        findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10});
        //how do we print a variable to the command line

        findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145});
        //how do we print a variable to the command line
*/
    }

    //Prob1
    public static void stringLengthOrValue(String inputString) {

        if (inputString.length() > 5) {
            System.out.println(inputString);
        } else System.out.println(inputString.length());
    }

    //Prob2
    public static void reversedOrder() {

        int[] intArray = new int[10];
        int value = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = value;
            value += 1;
        }

        for (int i = 9; (i >= 0); i--) {
            System.out.println(intArray[i]);

        }
    }

    //Prob3
    public static int maxValue(int[] inputArray) {

        int max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }

        }
        System.out.println(max);
        return max;

    }

    //Prob4
    public static double sumOfValues(double[] inputArray) {

        double arraySum = 0.0;

        for (int i = 0; i < inputArray.length; i++) {
            arraySum += inputArray[i];

        }

        return arraySum;

    }

    //Prob5
    public static String charsToString(char[] inputArray) {

        String newString = " ";

        for (int i = 0; i < inputArray.length; i++) {
            newString += inputArray[i];
        }

        return newString;

    }

    //Prob7
    public static void reversedStringOrder(List<String> myStringList) {

        for (int i = (myStringList.size() - 1); i >= 0; i--) {
            System.out.println(myStringList.get(i));
        }
    }

    //Prob8
    public static void printOrAdd(List<String> myStringList) {

        int listSize = myStringList.size();
        String newString = "Java";
        if (listSize == 10) {
            for (int i = 0; i < myStringList.size(); i++) {
                System.out.println(myStringList.get(i));
            }
        }
        else {
            newString = newString + listSize;
            myStringList.add(newString);
            System.out.println(myStringList);


        }

    }

    //Prob10
    public static int findMiddle(int[] oddSizedArray) {

        int medIndex = (oddSizedArray.length)/2;
        System.out.println(medIndex);
        int middleValue = oddSizedArray[medIndex];
        System.out.println(middleValue);
        return middleValue;

    }



}








