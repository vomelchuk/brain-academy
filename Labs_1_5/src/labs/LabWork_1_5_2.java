package labs;

import java.util.Scanner;

public class LabWork_1_5_2 {
	
	public static void main(String[] args) {

        System.out.print("Input number X = ");
        int x = new Scanner(System.in).nextInt();
        String result;

        if (x == 1) {
            result = "One";
        } else if (x == 2) {
            result = "Two";
        } else if (x == 3) {
            result = "Three";
        } else if (x == 4) {
            result = "Four";
        } else if (x == 5) {
            result = "Five";
        } else if (x == 6) {
            result = "Six";
        } else if (x == 7) {
            result = "Seven";
        } else if (x == 8) {
            result = "Eight";
        } else if (x == 9) {
            result = "Nine";
        } else {
            result = "Other";
        }

        System.out.println("After processing by if..else: " + result);

        switch (x) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Other";
        }

        System.out.println("After processing by switch: " + result);

    }
}

