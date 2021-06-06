/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

class Interest
{
    int p;
    double r;
    int t;
}

public class Exercise12
{
    public static void main( String[] args )
    {
        Interest i = new Interest();
        i = inputs(i);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("After " + i.t + " years at " + i.r + ", the investment will be worth $" + df.format((Math.ceil(i.p*(1+((i.r/100)*i.t)) * 100))/100));
    }

    public static Interest inputs(Interest i)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        i.p = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        i.r = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        i.t = sc.nextInt();
        return i;
    }
}
