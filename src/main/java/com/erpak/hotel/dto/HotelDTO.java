package com.erpak.hotel.dto;

import com.erpak.hotel.model.Hotel;
import lombok.Data;

@Data
public class HotelDTO {

    private String name;

    public HotelDTO(Hotel hotel) {
        this.name = hotel.getName();
    }

}
