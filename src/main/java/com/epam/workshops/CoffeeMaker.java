package com.epam.workshops;

import com.epam.workshops.items.Cocoa;
import com.epam.workshops.items.Coffee;
import com.epam.workshops.items.Milk;
import com.epam.workshops.items.Water;

import java.util.concurrent.TimeUnit;

public class CoffeeMaker
{

    Cocoa cocoa = new Cocoa();
    Coffee coffee= new Coffee();
    Milk milk= new Milk();
    Water water= new Water();

    public void runCommand(String command) throws InterruptedException {
        if(command.equals("status"))
        {
            runStatusCommands();
        }
        else if(command.equals("make coffee"))
        {
            runMakeCoffeeCommand();
        }
        else if(command.equals("exit"))
        {
            System.exit(0);
        }
        else if(command.equals("make CoffeeWithMilk"))
        {
            runCoffeeWithMilk();
        }
        else
        {
            System.out.println("Unknown command");
        }
    }

    private void runCoffeeWithMilk() throws InterruptedException
    {
        if(IsEnough(coffee.getCapacity(), 11) && IsEnough(water.getCapacity(), 180) && IsEnough(milk.getCapacity(), 20))
        {
            action.ChangeCapacity(coffee, 11);
            action.ChangeCapacity(water, 180);
            action.ChangeCapacity(milk, 20);
            action.DoAction("Grind", coffee, 600);
            action.DoAction("Heat", water, 900);
            action.DoAction("Pour", water, 1800);
            action.DoAction("Heat", milk, 600);
            action.DoAction("Pour", milk, 300);
            System.out.println("Done!");
        }
        else
        {
            System.out.println("Not enough ingredients");
        }
    }

    private void runStatusCommands()
    {
        System.out.println("Coffee: " + coffee.ToString());
        System.out.println("Water: " + water.ToString());
        System.out.println("Milk: " + milk.ToString());
        System.out.println("Cocoa: " + cocoa.ToString());
    }

    private void runMakeCoffeeCommand() throws InterruptedException
    {
        if(IsEnough(coffee.getCapacity(), 11) && IsEnough(water.getCapacity(), 200))
        {
            coffee.setCapacity(coffee.getCapacity() - 11);
            water.setCapacity(water.getCapacity() - 200);
            System.out.println("Grind coffee...");
            Thread.sleep(600);
            System.out.println("Heat water...");
            Thread.sleep(900);
            System.out.println("Pour water...");
            Thread.sleep(1200);
            System.out.println("Pour water...");
            Thread.sleep(600);
            System.out.println("Done!");
        }
        else
        {
            System.out.println("Not enough ingredients");
        }
    }

    private boolean IsEnough(int itemCapacity, int border)
    {
        if (itemCapacity >= border)
        {
            return true;
        }

        return false;
    }
}
