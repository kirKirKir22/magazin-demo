package com.example.magazin1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Monitors {

    private int serialNumber;
    private String manufacturer;
    private int price;
    private int quantity;
    private int diagonal;
}
