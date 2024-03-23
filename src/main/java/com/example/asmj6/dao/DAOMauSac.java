package com.example.asmj6.dao;

import com.example.asmj6.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DAOMauSac extends JpaRepository<MauSac, String> {
}
