package com.naveeak.smartelevator.object;

import java.util.Objects;

import static com.naveeak.smartelevator.constant.Constants.DEFAULT_ELEVATOR_FLOOR;
import static com.naveeak.smartelevator.constant.Constants.UP;

public class Elevator {
    private final String elevatorName;
    private String currentFloor;
    private String movingDirection;

    public Elevator(String elevatorName) {
        this(elevatorName,DEFAULT_ELEVATOR_FLOOR,UP);
    }

    public Elevator(String elevatorName, String currentFloor, String movingDirection) {
        this.elevatorName = elevatorName;
        this.currentFloor = currentFloor;
        this.movingDirection = movingDirection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elevator elevator = (Elevator) o;
        return elevatorName.equals(elevator.elevatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elevatorName);
    }

    public String getElevatorName() {
        return elevatorName;
    }

    public String getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(String currentFloor) {
        this.currentFloor = currentFloor;
    }

    public String getMovingDirection() {
        return movingDirection;
    }

    public void setMovingDirection(String movingDirection) {
        this.movingDirection = movingDirection;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "elevatorName='" + elevatorName + '\'' +
                ", currentFloor='" + currentFloor + '\'' +
                ", movingDirection='" + movingDirection + '\'' +
                '}';
    }
}

