package com.example.asmj6.dao;

import com.example.asmj6.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DAOKhachHang extends JpaRepository<KhachHang, String> {
}
