package com.github.loddar.liveprojectspringbootreact.salonapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<SalonServiceDetail> availableServices;

    @ManyToOne
    private SalonServiceDetail selectedService;

    private String stylistName;

    private LocalDateTime slotFor;
    private LocalDateTime confirmedAt;
    private LocalDateTime lockedAt;

    private SlotStatus status;
}
