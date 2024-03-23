package com.example.asmj6.dao;

import com.example.asmj6.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DAOSanPham extends JpaRepository<SanPham, String> {
}
