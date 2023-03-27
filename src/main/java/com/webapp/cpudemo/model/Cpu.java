package com.webapp.cpudemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name="cpu")
public class Cpu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private int id;
    @NonNull
    @Column(name="brand", nullable=false)
    private String brand;
    @NonNull
    @Column(name="model", nullable=false)
    private String model;
    @NonNull
    @Column(name="clockspeedBase", nullable=false)
    private BigDecimal clockspeedBase;
    @NonNull
    @Column(name="clockspeedTurbo")
    private BigDecimal clockspeedTurbo;
    @NonNull
    @Column(name="coresNum", nullable=false)
    private int coresNum;
    @NonNull
    @Column(name="threadsNum", nullable=false)
    private int threasdNum;
    @NonNull
    @Column(name="tdp", nullable=false)
    private BigDecimal tdp;
    @NonNull
    @Column(name="price", nullable=false)
    private BigDecimal price;
    @NonNull
    @ManyToOne
    @JoinColumn(name="socketId", nullable=false)
    private Socket socket;

    /*@JsonProperty("socket")
    private void unpackNested(Integer id) {
        this.socket = new Socket();
        socket.setId(id);
    }*/
}
