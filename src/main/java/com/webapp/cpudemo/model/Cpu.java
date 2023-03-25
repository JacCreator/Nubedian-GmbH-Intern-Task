package com.webapp.cpudemo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Cpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String brand;
    @NonNull
    private String model;
    @NonNull
    private BigDecimal clockspeedBase;
    @NonNull
    private BigDecimal clockspeedTurbo;
    @NonNull
    private int coresNum;
    @NonNull
    private int threasdNum;
    @NonNull
    private BigDecimal tdp;
    @NonNull
    private BigDecimal price;
    @NonNull
    private int socketId;

}
