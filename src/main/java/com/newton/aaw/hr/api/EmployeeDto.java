package com.newton.aaw.hr.api;

import java.time.LocalDateTime;

import com.newton.aaw.hr.domain.entity.Employee;
import com.newton.aaw.hr.domain.entity.enums.Gender;
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
	
	private String lastName;

    private LocalDateTime dateOfBirth;	

	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private String position;

    private Float monthlySalary;
	
	private Float hourSalary;

    private String area;
    
    private Gender gender;
    
    private LocalDateTime createdAt;
	
    private LocalDateTime modifiedAt;
	
	
	// constructor Entidade para DTO
	public EmployeeDto(Employee employeeDto) {
		this.id = employeeDto.getId();
		this.firstName = employeeDto.getFirstName();
        this.lastName = employeeDto.getLastName();
		this.dateOfBirth = employeeDto.getDateOfBirth();
		this.gender = employeeDto.getGender();
		this.startDate = employeeDto.getStartDate();
		this.endDate = employeeDto.getEndDate();
		this.position = employeeDto.getPosition();
        this.monthlySalary = employeeDto.getMonthlySalary();
        this.hourSalary = employeeDto.getHourSalary();
        this.area = employeeDto.getArea();
        this.createdAt = employeeDto.getCreatedAt();
        this.modifiedAt = employeeDto.getModifiedAt();
	}
	
}
