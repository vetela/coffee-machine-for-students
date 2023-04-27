package com.epam.workshops.items;

import java.util.Random;

public class Coffee extends Ingredients
{
    private final int MAX_VALUE = 2000;
    private int capacity;
    public int percent;

    public Coffee()
    {
        Random r = new Random();
        capacity = r.nextInt(MAX_VALUE) + 1;
        percent = (capacity * 100) / MAX_VALUE;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
        this.percent = (capacity * 100) / MAX_VALUE;
    }

    public String ToString()
    {
        return (percent + "% " + capacity + "g");
    }
}
