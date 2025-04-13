package com.careercode.empreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careercode.empreview.entity.EmployeeReview;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeReview, Long>{

}
