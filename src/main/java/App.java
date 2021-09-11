/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.text.NumberFormat;
import java.util.Scanner;
public class App
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        float prin = sc.nextFloat();
        System.out.print("Enter the rate of interest: ");
        float rate = sc.nextFloat();
        System.out.print("Enter the number of years: ");
        float years = sc.nextFloat();
        System.out.print("What is the number of times the interest is compounded per year? ");
        float compund = sc.nextFloat();
        float first = 1 + ((rate/100)/compund);
        float second = compund * years;
        float third = (float)Math.pow(first, second);

        float total = prin * third;
        float realTotal = (float) Math.round(total * 100) /100;
        NumberFormat form = NumberFormat.getCurrencyInstance();
        System.out.println(form.format(prin) +" invested at " + rate + "% for " + years + " years compounded " + compund + " times per year is " + form.format(realTotal) + ".");
    }
}
