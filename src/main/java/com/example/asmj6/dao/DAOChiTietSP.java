package com.example.asmj6.dao;

import com.example.asmj6.entity.ChiTietSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DAOChiTietSP extends JpaRepository<ChiTietSP, String> {
}
