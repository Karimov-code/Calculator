package com.company;
import java.util.Scanner;
import com.company.ArithmeticFunction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please insert the data to be calculated: ");
            String line = input.nextLine();
            ArithmeticFunction function = new ArithmeticFunction();

            System.out.println(function.getResult(line));
        }


    }
}
