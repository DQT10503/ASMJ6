package com.example.asmj6.dao;

import com.example.asmj6.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DAOCuaHang extends JpaRepository<CuaHang, String> {
}
