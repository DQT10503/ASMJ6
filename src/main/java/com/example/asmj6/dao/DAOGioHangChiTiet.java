package com.example.asmj6.dao;

import com.example.asmj6.entity.GioHangChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DAOGioHangChiTiet extends JpaRepository<GioHangChiTiet, String> {
}
