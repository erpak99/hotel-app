package com.erpak.hotel.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="hotel_id")
    private Long id;

    @Column(name="hotel_name")
    private String name;

    @OneToOne(mappedBy = "hotel", cascade = CascadeType.ALL)
    private ChatRoom chatRoom;


}
