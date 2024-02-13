package com.erpak.hotel.service;

import com.erpak.hotel.dto.HotelDTO;
import com.erpak.hotel.model.Hotel;
import com.erpak.hotel.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelService {

    private final HotelRepository hotelRepository;

    public HotelDTO findHotelById(Long hotelId) {

        Optional<Hotel> optionalHotel = hotelRepository.findById(hotelId);
        if (optionalHotel.isPresent()) {
            Hotel hotel = optionalHotel.get();
            return new HotelDTO(hotel);
        } else
            throw new RuntimeException("Hotel not found: " + hotelId);
    }
}
