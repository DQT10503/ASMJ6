package com.example.asmj6.dao;

import com.example.asmj6.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DAOHoaDon extends JpaRepository<HoaDon, String> {
}
