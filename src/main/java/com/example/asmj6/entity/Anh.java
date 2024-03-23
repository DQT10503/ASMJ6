package com.example.asmj6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Anh")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Anh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSP chiTietSP;
    @Column(name = "Anh")
    private byte[] anh;
}
