package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static exercise.Object.compare;

public class main {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Please enter your bill amount ($); ");

        double BillAmount = Console.nextInt();
        if (BillAmount<=280 && BillAmount>=99) {
            System.out.println("When the bill amount is $" + BillAmount + ", the tip amount is $" + ((BillAmount*15)/100) + "the total amount paid is $" + (BillAmount + ((BillAmount * 15) / 100)));

        }else if (BillAmount<=98){
            System.out.println("When the bill amount is $" +BillAmount+ ", the tip amount is $"+ ((BillAmount*20)/100)+ "the total amount paid is $" +(BillAmount+((BillAmount*20)/100)));
        }else if (BillAmount>=281){
            System.out.println("When the bill amount is $" +BillAmount+ ", the tip amount is $"+ ((BillAmount*20)/100)+ "the total amount paid is $" +(BillAmount+((BillAmount*20)/100)));
        }









    }
}
