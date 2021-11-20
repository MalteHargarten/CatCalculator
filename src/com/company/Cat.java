package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cat
{
    public static final int AGE_OF_MATURITY = 6;
    public static final int OFFSPRING_CYCLE_LENGTH = 3;
    protected int id;
    protected int age;

    public Cat(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return String.format("I am cat number %d", this.id);
    }

    public List<Cat> DoOffspring(int counter)
    {
        if(this.age <= AGE_OF_MATURITY)
        {
            return null;
        }
        return Arrays.asList(new Cat(counter + 1), new Cat(counter + 2));
    }
}