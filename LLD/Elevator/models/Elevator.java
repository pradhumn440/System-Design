package com.LLD.Elevator.models;

import com.LLD.Elevator.enums.DoorState;
import com.LLD.Elevator.enums.ElevatorDirection;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Elevator {
    private int elevatorId;
    private int currentFloor;
    private int destinationFloor;
    private DoorState doorState;
    private ElevatorDirection elevatorDirection;
    private ElevatorButton elevatorButton;
}
