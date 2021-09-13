package com.newton.aaw.hr.api;

import java.time.LocalDateTime;

import com.newton.aaw.hr.api.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

	private Integer id;
	
	private String firstName;

    private LocalDateTime dateOfBirth;
	
	private enum gender {
        M(1), F(2)
    }; 
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String position;

    private Float monthlySalary;
	
	private Float hourSalary;

    private String area;
	
	// construtor Entidade para DTO
	public EmployeeDto(Employee e) {
		this.id = e.getId();
		this.firstName = e.getFirst();
        this.lastName = e.getLasFirst();
		this.dateOfBirth = e.getDateofBirth();
		this.gender = e.getGender();
		this.startDate = e.getStartDate();
		this.endDate = e.getEndDate();
		this.position = e.getPosition();
        this.monthlySalary = e.getMonthlySalary();
        this.hourSalary = e.getHourSalary();
        this.area = e.getArea();
	}
	
}
