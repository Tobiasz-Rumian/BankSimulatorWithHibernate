package com.tobiaszRumian.bankSimulator;

/**
 * Created by zekori96 on 30.09.2016.
 */
public class Customer
{
    static private int nextId=1;
    private int id;
    private String forename;
    private String surname;
    private Address address;
    public Customer()
    {
        address=new Address(id);
        id=nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getForename() {
        return forename;
    }
    public void setForename(String forename) {
        this.forename = forename;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Address getAddress()
    {
        return address;
    }


}
