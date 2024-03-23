package com.example.asmj6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "HoaDonChiTiet")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HoaDonChiTiet {
    @Id
    @ManyToOne
    @JoinColumn(name = "IdHoaDon")
    private HoaDon idHoaDon;
    @Id
    @ManyToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSP idChiTietSp;
    private int soLuong;
    private BigDecimal donGia;
}
