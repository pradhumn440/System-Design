package com.LLD.Elevator.models;

import com.LLD.Elevator.enums.FloorDirection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FloorButton extends Button {
    private FloorDirection floorDirection;

    public void pressButton() {
        this.isPressed = true;
    }
}
