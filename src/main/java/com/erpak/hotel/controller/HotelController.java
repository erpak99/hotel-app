package com.erpak.hotel.controller;

import com.erpak.hotel.dto.HotelDTO;
import com.erpak.hotel.model.Hotel;
import com.erpak.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hotel")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @GetMapping("/{hotelId}")
    public HotelDTO findHotelById(@PathVariable Long hotelId) {
        return hotelService.findHotelById(hotelId);
    }

}
