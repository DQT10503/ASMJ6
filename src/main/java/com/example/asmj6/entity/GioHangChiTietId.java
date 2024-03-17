package com.example.asmj6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GioHangChiTietId implements Serializable {
    private UUID idGioHang;
    private UUID idChiTietSP;
}
