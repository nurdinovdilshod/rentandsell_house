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
public class HouseForRent {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String monthlyRent;
    private String period;
    private String address;
    private String lon;
    private String lat;
    private String properties;
    @ManyToOne
    private AuthUser owner;
    @ManyToMany
    private List<Document> documentId;
    private HouseForRentStatus status;
    private String description;

}
