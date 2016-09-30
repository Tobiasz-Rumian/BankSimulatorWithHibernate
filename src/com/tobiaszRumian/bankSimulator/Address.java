package com.tobiaszRumian.bankSimulator;

/**
 * Created by zekori96 on 30.09.2016.
 */
public class Address
{
    private int id;
    private String city;
    private String street;
    private short  houseNumber;
    private short  apartmentNumber;
    public Address(){}
    public Address(int id)
    {
        this.id=id;
    }
    public int getId() {
    return id;
}
    public void setId(int id){this.id=id;}
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setStreet(String street)
    {
        this.street=street;
    }
    public void setHouseNumber(short houseNumber)
    {
        this.houseNumber=houseNumber;
    }
    public void setApartmentNumber(short apartmentNumber)
    {
        this.apartmentNumber=apartmentNumber;
    }
    public String getStreet()
    {
        return street;
    }
    public short getHouseNumber()
    {
        return houseNumber;
    }
    public short getApartmentNumber()
    {
        return apartmentNumber;
    }
}
