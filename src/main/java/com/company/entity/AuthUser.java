package com.company.entity;

import com.company.enums.AuthUserStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String fullName;
    private String password;
    private String pinfl;
    private String phoneNumber;
    private String email;
    private AuthUserStatus status = AuthUserStatus.NO_ACTIVE;
    @ManyToMany
    private List<AuthPermissions> permissionId;
}
