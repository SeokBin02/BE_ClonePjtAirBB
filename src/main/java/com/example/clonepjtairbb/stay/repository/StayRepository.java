 package com.example.clonepjtairbb.stay.repository;

 import com.example.clonepjtairbb.stay.entity.Stay;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.http.ResponseEntity;

 public interface StayRepository extends JpaRepository<Stay, Long> {
 }
