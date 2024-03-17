package com.example.asmj6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PhieuGiaoHang")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PhieuGiaoHang {
    @Id
    @GeneratedValue(strategy = Ge)
}
