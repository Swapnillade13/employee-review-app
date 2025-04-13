package com.careercode.empreview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careercode.empreview.entity.EmployeeReview;
import com.careercode.empreview.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeReviewContoller {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/getReview")
	public ResponseEntity<EmployeeReview> getAllEmployeeReview() {
		
		List<EmployeeReview> employeeReview = employeeRepository.findAll();
		
		return new ResponseEntity(employeeReview, HttpStatus.OK);
		
	}
	
	@GetMapping("/addReview")
	public String addEmployeeReview() {
		EmployeeReview review = new EmployeeReview();
		
		review.setEmployeeName("Nishant Patil Sir");
		review.setDesignation("Senior Lead Engineer");
		review.setEmployeeId("ID78722");
		review.setReview("He is the great team leader and person...");
		
		employeeRepository.save(review);
		
		return "Employee Review Added Succssfully!";
		
	}
	
	@GetMapping("/addReview2")
	public String addEmployeeReview2() {
		EmployeeReview review = new EmployeeReview();
		
		review.setEmployeeName("Deepashri Pisal");
		review.setDesignation("Senior Lead Engineer");
		review.setEmployeeId("ID78711");
		review.setReview("She is the great team leader and person...");
		
		employeeRepository.save(review);
		
		return "Employee Review Added Succssfully!";
		
	}
	
}
