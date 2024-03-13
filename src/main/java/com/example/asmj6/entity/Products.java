package com.example.asmj6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Products")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ten")
    private String ten;
    private String hinhAnh;

}
