package com.newton.aaw.hr.api;

import java.time.LocalDateTime;

import com.newton.aaw.hr.domain.entity.Employee;

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
        MASCULINO, FEMININO
    }; 
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String position;

    private Float monthlySalary;
	
	private Float hourSalary;

    private String area;
	
	// construtor Entidade para DTO
	public EmployeeDto(EmployeeDto employeeDto) {
		this.id = employeeDto.getId();
		this.firstName = employeeDto.getFirst();
        this.lastName = employeeDto.getLasFirst();
		this.dateOfBirth = employeeDto.getDateofBirth();
		this.gender = employeeDto.getGender();
		this.startDate = employeeDto.getStartDate();
		this.endDate = employeeDto.getEndDate();
		this.position = employeeDto.getPosition();
        this.monthlySalary = employeeDto.getMonthlySalary();
        this.hourSalary = employeeDto.getHourSalary();
        this.area = employeeDto.getArea();
	}
	
}
