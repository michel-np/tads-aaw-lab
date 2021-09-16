package com.newton.aaw.hr.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.exception.NotFoundException;

@Service
public class EmployeeService {

	private static int id = 0;
	// armazenar em memória os objetos
	private Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

	// C - CRUD
	public Employee create(Employee u) {
		u.setId(++id);
		
		u.setCreatedAt(LocalDateTime.now());
		u.setModifiedAt(LocalDateTime.now());

		employees.put(id, u);
		
		return u;
	}
	
	// u - CRUD
	public Employee update(Integer id, Employee e) {

		// recuperar para validar se existe
		var existing = get(id);

		// update
		existing.setFirstName(e.getFirstName());
		existing.setLastName(e.getLastName());
		existing.setDateOfBirth(e.getDateOfBirth());
		existing.setGender(e.getGender());
		existing.setStartDate(e.getStartDate());
		existing.setEndDate(e.getEndDate());
		existing.setPosition(e.getPosition());
		existing.setMonthlySalary(e.getMonthlySalary());
		existing.setArea(e.getArea());
		existing.setCreatedAt(e.getCreatedAt());
		existing.setModifiedAt(e.getModifiedAt());
	
		
		existing.setModifiedAt(LocalDateTime.now());

		return existing;
	}
	
	// R - CRUD
	public Employee get(Integer id) {
		
		var employee = employees.get(id);
		
		if (employee == null) {
			throw new NotFoundException("Employee with ID " + id + " not found");
		} 
		
		return employee;
	}
	
	// R - CRUD
	public List<Employee> getAll() {
		return new ArrayList<>(employees.values());
	}
	
	// D - CRUD
	public void delete(Integer id) {

		// recuperar para validar se existe
		get(id);
		
		employees.remove(id);
	}
	
}
