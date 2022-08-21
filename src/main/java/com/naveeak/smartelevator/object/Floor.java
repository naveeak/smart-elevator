package com.naveeak.smartelevator.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Floor {
    private final String floorName;
    private List<Elevator> allPossibleElevatorsInFloor ;
    private List<Elevator> listOfElevatorsPresentInFloor ;

    public Floor(String floorName, List<Elevator> allPossibleElevatorsInFloor) {
        this(floorName,allPossibleElevatorsInFloor, new ArrayList<>());
    }

    public Floor(String floorName, List<Elevator> allPossibleElevatorsInFloor, List<Elevator> listOfElevatorsPresentInFloor) {
        this.floorName = floorName;
        this.allPossibleElevatorsInFloor = allPossibleElevatorsInFloor;
        this.listOfElevatorsPresentInFloor = listOfElevatorsPresentInFloor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Floor floor = (Floor) o;
        return floorName.equals(floor.floorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorName);
    }

    public String getFloorName() {
        return floorName;
    }

    public List<Elevator> getAllPossibleElevatorsInFloor() {
        return allPossibleElevatorsInFloor;
    }

    public void setAllPossibleElevatorsInFloor(List<Elevator> allPossibleElevatorsInFloor) {
        allPossibleElevatorsInFloor = allPossibleElevatorsInFloor;
    }

    public List<Elevator> getListOfElevatorsPresentInFloor() {
        return listOfElevatorsPresentInFloor;
    }

    public void setListOfElevatorsPresentInFloor(List<Elevator> listOfElevatorsPresentInFloor) {
        this.listOfElevatorsPresentInFloor = listOfElevatorsPresentInFloor;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorName='" + floorName + '\'' +
                ", AllPossibleElevatorsInFloor=" + allPossibleElevatorsInFloor +
                ", listOfElevatorsPresentInFloor=" + listOfElevatorsPresentInFloor +
                '}';
    }
}
