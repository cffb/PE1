package QUARTER1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PE
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number (0-99): ");
        int num = sc.nextInt();

        int tens = 0;
        int ones = 0;

        tens = num / 10;
        ones = num - tens * 10;

        //0 to 19
        if (num == 0) {
            System.out.print("Zero");
        } else if (num == 1) {
            System.out.print("One");
        } else if (num == 2) {
            System.out.print("Two");
        } else if (num == 3) {
            System.out.print("Three");
        } else if (num == 4) {
            System.out.print("Four");
        } else if (num == 5) {
            System.out.print("Five");
        } else if (num == 6) {
            System.out.print("Six");
        } else if (num == 7) {
            System.out.print("Seven");
        } else if (num == 8) {
            System.out.print("Eight");
        } else if (num == 9) {
            System.out.print("Nine");
        } else if (num == 10) {
            System.out.print("Ten");
        } else if (num == 11) {
            System.out.print("Eleven");
        } else if (num == 12) {
            System.out.print("Twelve");
        } else if (num == 13) {
            System.out.print("Thirteen");
        } else if (num == 14) {
            System.out.print("Fourteen");
        } else if (num == 15) {
            System.out.print("Fifteen");
        } else if (num == 16) {
            System.out.print("Sixteen");
        } else if (num == 17) {
            System.out.print("Seventeen");
        } else if (num == 18) {
            System.out.print("Eighteen");
        } else if (num == 19) {
            System.out.print("Nineteen");
        } else {
            //20 to 99
            if (tens == 2) {
                System.out.print("Twenty ");
            } else if (tens == 3) {
                System.out.print("Thirty ");
            } else if (tens == 4) {
                System.out.print("Forty ");
            } else if (tens == 5) {
                System.out.print("Fifty ");
            } else if (tens == 6) {
                System.out.print("Sixty ");
            } else if (tens == 7) {
                System.out.print("Seventy ");
            } else if (tens == 8) {
                System.out.print("Eighty ");
            } else if (tens == 9) {
                System.out.print("Ninety ");
            }

            if (ones == 1) {
                System.out.print("One");
            } else if (ones == 2) {
                System.out.print("Two");
            } else if (ones == 3) {
                System.out.print("Three");
            } else if (ones == 4) {
                System.out.print("Four");
            } else if (ones == 5) {
                System.out.print("Five");
            } else if (ones == 6) {
                System.out.print("Six");
            } else if (ones == 7) {
                System.out.print("Seven");
            } else if (ones == 8) {
                System.out.print("Eight");
            } else if (ones == 9) {
                System.out.print("Nine");
            }
        }
    }
}