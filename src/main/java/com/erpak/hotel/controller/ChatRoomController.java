package com.erpak.hotel.controller;

import com.erpak.hotel.dto.ChatRoomDTO;
import com.erpak.hotel.model.ChatRoom;
import com.erpak.hotel.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chatroom")
@RequiredArgsConstructor
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    @GetMapping("/hotel/{hotelId}")
    public ChatRoomDTO findChatRoomByHotelId(@PathVariable Long hotelId) {
        return chatRoomService.findChatRoomByHotelId(hotelId);
    }

}
