package com.example.asmj6.dao;

import com.example.asmj6.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface DAOChucVu extends JpaRepository<ChucVu, String> {
}
