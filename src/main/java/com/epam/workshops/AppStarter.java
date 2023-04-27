package com.epam.workshops;
import java.util.Scanner;

/**
 * Contains main, starts the app
 *
 * @author Marcin Ogorzalek
 */
class AppStarter
{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        while (true)
        {
            System.out.println("Coffee maker> ");
            String command = scanner.nextLine();
            coffeeMaker.runCommand(command);
        }
    }
}
