package com.chandu.hibernetpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.hibernetpractice.entity.EmployeeEntity;
import com.chandu.hibernetpractice.model.EmployeeModel;
import com.chandu.hibernetpractice.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	EmployeeService emloyeeService;

	@PostMapping("/create")
	public ResponseEntity<EmployeeModel> create(@RequestBody EmployeeModel employeeModel) {
		return ResponseEntity.ok(emloyeeService.create(employeeModel));
	}
	// getByID
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeModel> getByID(@PathVariable("id") int id){
		return ResponseEntity.ok(emloyeeService.getId(id));
	}
	
	//get all emp
	@GetMapping("/all")
	public ResponseEntity<List<EmployeeModel>> getAllEmp(){
		return ResponseEntity.ok(emloyeeService.getAll());
	}
	
//deleteByID
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteById(@PathVariable("id") int id){
		return ResponseEntity.ok(emloyeeService.deleteByID(id));
	}
	//updateByID
	@PutMapping("/{id}")
	public ResponseEntity<EmployeeEntity> updateByID(@RequestBody EmployeeEntity employeeEntity){
		return ResponseEntity.ok(emloyeeService.updateById(employeeEntity));
	}
	
}
