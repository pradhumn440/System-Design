package com.LLD.Elevator;


import com.LLD.Elevator.enums.DoorState;
import com.LLD.Elevator.enums.ElevatorDirection;
import com.LLD.Elevator.enums.FloorDirection;
import com.LLD.Elevator.models.Elevator;
import com.LLD.Elevator.models.ElevatorButton;
import com.LLD.Elevator.models.Floor;
import com.LLD.Elevator.models.FloorButton;
import com.LLD.Elevator.service.ElevatorService;
import com.LLD.LldApplication;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FloorButton> buttons = new ArrayList<>();
        buttons.add(new FloorButton(FloorDirection.UP));
        buttons.add(new FloorButton(FloorDirection.DOWN));

        List<Elevator> elevators = new ArrayList<>();
        elevators.add(new Elevator(1, 9, -2, DoorState.CLOSE, ElevatorDirection.IDLE, new ElevatorButton(-2)));
        elevators.add(new Elevator(2, 1, -2, DoorState.CLOSE, ElevatorDirection.IDLE, new ElevatorButton(-2)));

        List<Floor> floors = new ArrayList<>();
        int i=1;
        while (i<11) {
            floors.add(new Floor(i++, buttons, elevators));
        }

        for (Floor floor : floors) System.out.println(floor.toString());

        SpringApplication.run(LldApplication.class, args);

        // pressed UP button
        floors.get(5).getFloorButtons().stream().filter(
                floorButton -> floorButton.getFloorDirection().equals(FloorDirection.UP)
        ).findFirst().get().pressButton();

        System.out.println("Pressed up button for floor 5");

        int elevator = ElevatorService.getElevator(elevators, 5);
        System.out.println("Elevator at your service: "+elevator);
    }
}
