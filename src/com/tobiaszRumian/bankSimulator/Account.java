package com.tobiaszRumian.bankSimulator;

/**
 * Created by zekori96 on 30.09.2016.
 */
public class Account
{
    private double balance;
    public Account(){}
    public void add(double value)
    {
        balance+=value;
    }
    public void subtract(double value)
    {
        balance-=value;
    }
}
