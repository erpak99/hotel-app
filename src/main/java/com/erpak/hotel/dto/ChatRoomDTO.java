package com.erpak.hotel.dto;

import com.erpak.hotel.model.ChatRoom;
import lombok.Data;

@Data
public class ChatRoomDTO {

    private String hotelName;

    public ChatRoomDTO(ChatRoom chatRoom) {
        this.hotelName = chatRoom.getHotel().getName();
    }

}
