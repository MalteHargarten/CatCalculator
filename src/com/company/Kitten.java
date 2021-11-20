package com.company;

public class Kitten
{
    protected int id;

    public Kitten(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return String.format("I am kitten number %d", this.id);
    }
}