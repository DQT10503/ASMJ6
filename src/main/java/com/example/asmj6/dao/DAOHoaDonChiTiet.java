package com.example.asmj6.dao;

import com.example.asmj6.entity.HoaDonChiTiet;
import com.example.asmj6.entity.HoaDonChiTietId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DAOHoaDonChiTiet extends JpaRepository<HoaDonChiTiet, HoaDonChiTietId> {
}
