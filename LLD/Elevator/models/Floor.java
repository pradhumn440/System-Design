package com.LLD.Elevator.models;

import com.LLD.Elevator.enums.FloorDirection;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Floor {
    private int floorNumber;
    private List<FloorButton> floorButtons;
    private List<Elevator> elevatorList;

    private void callElevator(FloorDirection floorDirection) {
//        floorButtons.(floorDirection);

        // call elevator logic

    }
}
