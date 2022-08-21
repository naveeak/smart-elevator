package com.naveeak.smartelevator.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonUtils {

    /**
     * Method to validated the  inout constant variable that is floor count and floor list count
     * , if all unique floor size is equal to the floor count then true else false
     * @param floorCount static variable
     * @param floorList static variable
     * @return true or false
     */
    public boolean floorCountVsListValidator(String floorCount, String floorList){
        try{
            Integer floorCountInt = Integer.parseInt(floorCount);
            Set<String> uniqueFloorList = new HashSet(Arrays.asList(floorList.split(",")));
            return uniqueFloorList.size() == floorCountInt;
        }catch(Exception e){
            //TODO logging class addition
            return false;
        }
    }

}
