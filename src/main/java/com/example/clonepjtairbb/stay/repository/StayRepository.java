 package com.example.clonepjtairbb.stay.repository;

 import java.util.List;

 import com.example.clonepjtairbb.stay.dto.StayListResponse;
 import com.example.clonepjtairbb.stay.entity.Stay;

 import com.example.clonepjtairbb.stay.repository.QueryDSL.StayRepositoryCustom;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.http.ResponseEntity;

 public interface StayRepository extends JpaRepository<Stay, Long>, StayRepositoryCustom {

  List<Stay> findTop20();
 }
