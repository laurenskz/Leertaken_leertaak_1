package nl.hanze.week2.ATM;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create the context
        ATM atm = new ATM();
        atm.setState(new IdleState());

        System.out.println("Type a number for an event:");
        System.out.println("1. Insert card");
        System.out.println("2. Enter PIN code");
        System.out.println("3. Enter amount");
        System.out.println("4. I want my money honey");
        System.out.println();

        System.out.println("Insert your card");

        Scanner scanner = new Scanner(System.in);
        String line;
        while ((line = scanner.nextLine()) != "exit") {
            if (NumberUtils.isParsable(line)) {
                int number = Integer.parseInt(line);
                switch (number) {
                    case 1:
                        atm.insertCard();
                        break;
                    case 2:
                        atm.insertPin();
                        break;
                    case 3:
                        atm.requestAmount();
                        break;
                    case 4:
                        atm.ejectCard();
                }
            }else {
                System.out.println("This is not a number");
            }
        }
    }
}