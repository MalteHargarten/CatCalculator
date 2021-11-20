package com.company;

public class TeenageCat
{
    protected int id;

    public TeenageCat(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return String.format("I am a teenage cat number %d", this.id);
    }
}