package com.project.TaxiBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.TaxiBookingApp.entity.Admin;

@Repository
public interface lAdminRepository extends JpaRepository<Admin, Integer>{

}
