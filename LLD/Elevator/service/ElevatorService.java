package com.LLD.Elevator.service;

import com.LLD.Elevator.models.Elevator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElevatorService {

    public static int getElevator(List<Elevator> elevators, int currentFloor) {
        int elevatorIDToBeReturned = -2;
        int minDistance = Integer.MAX_VALUE;
        
        for (Elevator elevator : elevators) {
            if (Math.abs(elevator.getCurrentFloor() - currentFloor) < minDistance) {
                minDistance = Math.abs(elevator.getCurrentFloor() - currentFloor);
                elevatorIDToBeReturned = elevator.getElevatorId();
            }
        }
        return elevatorIDToBeReturned;
    }
}
