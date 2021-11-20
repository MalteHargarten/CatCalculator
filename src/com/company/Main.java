package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the time duration as an integer (in months)");
        int timeDuration = Integer.parseInt(sc.nextLine()); // in months
        Cat original = new Cat(counter);
        List<Cat> cats = new ArrayList<>();
        cats.add(original);
        System.out.println(String.format("In month 0, there is exactly one cat"));
        for(int month = Cat.OFFSPRING_CYCLE_LENGTH; month <= timeDuration; month += Cat.OFFSPRING_CYCLE_LENGTH)
        {
            System.out.println(String.format("-----------------------------------------------------------\nBeginning month %d", month));
            List<Cat> kittens = new ArrayList<>();
            for (Cat cat : cats)
            {
                cat.age += Cat.OFFSPRING_CYCLE_LENGTH;
                List<Cat> newKittens = cat.DoOffspring(counter);
                if(newKittens != null)
                {
                    counter += kittens.size();
                    kittens.addAll(newKittens);
                    System.out.println(String.format("Cat %d has had %d new kittens", cat.id, kittens.size()));
                }
                else
                {
                    System.out.println(String.format("Cat %d is %d months old and therefore cannot have kittens (yet)", cat.id, cat.age));
                }
            }
            cats.addAll(kittens);
            System.out.println(String.format("In month %d, there are now %d cats in total (some of which may not be mature yet)", month, cats.size()));
        }
        System.out.println(String.format("At the end of the %d time period, there are %d cats in total", timeDuration, cats.size()));
    }
}
