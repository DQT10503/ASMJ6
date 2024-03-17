package com.example.asmj6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "GioHang")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String ma;
    private Date ngayTao;
    private Date ngayThanhToan;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;
    private int tinhTrang;
}
