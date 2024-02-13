package com.erpak.hotel.service;

import com.erpak.hotel.dto.ChatRoomDTO;
import com.erpak.hotel.dto.HotelDTO;
import com.erpak.hotel.model.ChatRoom;
import com.erpak.hotel.model.Hotel;
import com.erpak.hotel.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;

    public ChatRoomDTO findChatRoomByHotelId(Long hotelId) {

        Optional<ChatRoom> optionalChatRoom = Optional.ofNullable(chatRoomRepository.findByHotelId(hotelId));
        if (optionalChatRoom.isPresent()) {
            ChatRoom chatRoom = optionalChatRoom.get();
            return new ChatRoomDTO(chatRoom);
        } else {
            throw new RuntimeException("Chat room not found");
        }
    }


}
