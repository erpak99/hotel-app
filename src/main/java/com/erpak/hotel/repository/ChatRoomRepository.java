package com.erpak.hotel.repository;

import com.erpak.hotel.model.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom,Long> {

    ChatRoom findByHotelId(Long hotelId);

}
