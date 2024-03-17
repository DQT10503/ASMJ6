package com.example.asmj6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "GioHangChiTiet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GioHangChiTiet {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.UUID)
    private GioHangChiTietId id;
    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonGia")
    private BigDecimal donGia;
    @Column(name = "DonGiaKhiGiam")
    private BigDecimal donGiaKhiGiam;
}
