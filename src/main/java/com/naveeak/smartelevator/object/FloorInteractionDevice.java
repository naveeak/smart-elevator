package com.naveeak.smartelevator.object;

import java.util.List;

public class FloorInteractionDevice {
    public final String floorCurrentlyIn ;
    public List<Elevator> elevatorList ;
    public List<Floor> possibleFloor;
    public List<Double> distanceToElevatorsInCurrentFloor;

    public FloorInteractionDevice(String floorCurrentlyIn, List<Elevator> elevatorList, List<Floor> possibleFloor, List<Double> distanceToElevatorsInCurrentFloor) {
        this.floorCurrentlyIn = floorCurrentlyIn;
        this.elevatorList = elevatorList;
        this.possibleFloor = possibleFloor;
        this.distanceToElevatorsInCurrentFloor = distanceToElevatorsInCurrentFloor;
    }

    public String getFloorCurrentlyIn() {
        return floorCurrentlyIn;
    }

    public List<Elevator> getElevatorList() {
        return elevatorList;
    }

    public void setElevatorList(List<Elevator> elevatorList) {
        this.elevatorList = elevatorList;
    }

    public List<Floor> getPossibleFloor() {
        return possibleFloor;
    }

    public void setPossibleFloor(List<Floor> possibleFloor) {
        this.possibleFloor = possibleFloor;
    }

    public List<Double> getDistanceToElevatorsInCurrentFloor() {
        return distanceToElevatorsInCurrentFloor;
    }

    public void setDistanceToElevatorsInCurrentFloor(List<Double> distanceToElevatorsInCurrentFloor) {
        this.distanceToElevatorsInCurrentFloor = distanceToElevatorsInCurrentFloor;
    }

    @Override
    public String toString() {
        return "FloorInteractionDevice{" +
                "floorCurrentlyIn='" + floorCurrentlyIn + '\'' +
                ", elevatorList=" + elevatorList +
                ", possibleFloor=" + possibleFloor +
                ", distanceToElevatorsInCurrentFloor=" + distanceToElevatorsInCurrentFloor +
                '}';
    }
}
