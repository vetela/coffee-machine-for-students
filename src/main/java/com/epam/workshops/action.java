package com.epam.workshops;

import com.epam.workshops.items.Ingredients;

public class action
{
    public static void DoAction(String stage, Ingredients ingredient, int time) throws InterruptedException
    {
        System.out.println(stage + " " + ingredient + "... ");
        Thread.sleep(time);
    }

    public static void ChangeCapacity(Ingredients ingredient, int amount) throws InterruptedException
    {
       ingredient.setCapacity(ingredient.getCapacity() - amount);
    }
}
