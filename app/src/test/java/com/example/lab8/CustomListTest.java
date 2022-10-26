package com.example.lab8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {


    /**
     * we create a CustomList object before running
     */
    public CustomList createList(){
        CustomList list = new CustomList(null,new ArrayList<City>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        CustomList list = createList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * get the size of the list
     * increase the list by adding a new city and decrease the list by deleting the city
     * check if our current size matches the initial size
     */
    @Test
    public void deleteCityTest(){
        CustomList list = createList();
        int listSize = list.getCount();
        City myCity = new City("Estevan", "SK");
        list.addCity(myCity);
        list.deleteCity(myCity);
        assertEquals(listSize, list.getCount());
    }

    /**
     * add a city and test if the cities have city that was just added
     *
     */
    @Test
    public void hasCityTest(){
        CustomList list = createList();
        City myCity = new City("Estevan", "SK");
        list.addCity(myCity);
        boolean has = list.hasCity(myCity);
        assertEquals(has, true);
    }

    /**
     * add a city and test if the cities have city that was just added
     *
     */
    @Test
    public void getCountTest(){
        CustomList list = createList();
        City myCity = new City("Estevan", "SK");
        list.addCity(myCity);
        int count = list.getCount();
        assertEquals(1, count);
    }


}
