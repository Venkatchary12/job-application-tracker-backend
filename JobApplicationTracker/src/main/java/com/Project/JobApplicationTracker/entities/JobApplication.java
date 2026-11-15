package com.Project.JobApplicationTracker.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "jobApplication")
@Getter
@Setter
public class JobApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    private String jobRole;
    private LocalDate appliedDate;
    private String status;
    private LocalDate interviewDate;
    
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
	
	
}
