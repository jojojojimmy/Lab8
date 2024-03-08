package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    /**
     * create a mocklist for my citylist
     */

    public CustomList MockCityList()
    {
        list = new CustomList(null, new ArrayList<City>());
        return list;
    }

    @Test
    public void addCityTest()
    {
        list=MockCityList();
        int listSize=list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest()
    {
        list=MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.hasCity(city),true);
    }

    @Test
    public void deleteCityTest()
    {
        list=MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        int listSize=list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize-1);
    }

    @Test
    public void getCountTest()
    {
        list=MockCityList();
        assertEquals(list.getCount(),0);
    }
}

