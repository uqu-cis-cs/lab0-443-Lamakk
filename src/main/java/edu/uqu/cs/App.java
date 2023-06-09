package edu.uqu.cs;

import java.util.Scanner;

public class App{

    public static void twisters() {
     int count=0;
        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                System.out.print("Tweetle");

                if (i % 4 == 0) {
                    System.out.print("Beetle");
                }

                if (i % 6 == 0) {
                    System.out.print("Poodle");
                }
            }
           
            else {
                System.out.print(" " + i + " ");
            }
            count++;
            if(count==11){
                count=0;
                        System.out.println();
            }
        }
    }

    public static void phoneKeypad(String lma) {

        // this String var will hold the result
        // it's String and not int so that when adding numbers 
        // they are added next to each other and not math addition
        String result = "";
        
        // loop for each char in the text
        for (char ch : lma.toUpperCase().toCharArray()) {
            // switch case for each 3 letters
            switch (ch) {
                case 'A':
                case 'B':
                case 'C':
                    result += "2";
                    break;
                case 'D':
                case 'E':
                case 'F':
                    result += "3";
                    break;
                case 'G':
                case 'H':
                case 'I':
                    result += "4";
                    break;
                case 'J':
                case 'K':
                case 'L':
                    result += "5";
                    break;
                case 'M':
                case 'N':
                case 'O':
                    result += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    result += "7";
                    break;
                case 'T':
                case 'U':
                case 'V':
                    result += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    result += "9";
                    break;
            }
        }

        System.out.println(result);
    }

    public static void main(String [] args) {

        twisters();
        System.out.println("\n"+"Enter a string >> ");
        Scanner sca = new Scanner(System.in);
        String s=sca.nextLine();
        phoneKeypad(s);
    }
}