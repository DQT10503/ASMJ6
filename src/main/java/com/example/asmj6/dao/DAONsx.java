package com.example.asmj6.dao;

import com.example.asmj6.entity.NSX;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAONsx extends JpaRepository<NSX, String> {
}
