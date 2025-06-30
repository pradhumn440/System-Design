package com.LLD.Elevator.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Building {
    private Floor floor;
    private Elevator elevator;
}
