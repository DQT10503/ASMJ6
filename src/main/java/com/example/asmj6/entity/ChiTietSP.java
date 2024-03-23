package com.example.asmj6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Table(name = "ChiTietSP")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSP {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @ManyToOne
    @JoinColumn(name = "IdSP")
    private SanPham idSp;
    @ManyToOne
    @JoinColumn(name = "IdNsx")
    private NSX idNsx;
    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac idMauSac;
    @ManyToOne
    @JoinColumn(name = "IdDongSP")
    private DongSP idDongSp;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "NamBH")
    private Integer namBh;
    @Column(name = "MoTa")
    private String moTa;
    @Column(name = "SoLuongTon")
    private Integer soLuongTon;
    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;
    @Column(name = "GiaBan")
    private BigDecimal giaBan;
    @Column(name = "ThoiGianThem")
    private LocalDateTime thoiGianThem;

}
