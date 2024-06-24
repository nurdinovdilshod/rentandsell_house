package com.company.entity;

import com.company.enums.HouseForRentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class HouseForSale {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String address;
    @ManyToOne
    private AuthUser owner;
    private String lon;
    private String lat;
    private String properties;
    private String description;
    private String cost;
    private HouseForRentStatus status;
    @ManyToMany
    private List<Document> documentId;
}
