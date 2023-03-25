package com.webapp.cpudemo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name="socket")
public class Socket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;

    @NonNull
    @Column(name="name", nullable=false, unique=true)
    private String name;

    @OneToMany(
            mappedBy="socket",
            cascade=CascadeType.ALL,
            orphanRemoval = true // I am not sure here :(
    )
    @Setter private Set<Cpu> cpus = new HashSet<>();
}
