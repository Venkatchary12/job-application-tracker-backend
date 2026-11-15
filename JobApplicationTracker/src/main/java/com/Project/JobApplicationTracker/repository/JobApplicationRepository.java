package com.Project.JobApplicationTracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.JobApplicationTracker.entities.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long>{
	
	 List<JobApplication> findByStatusIgnoreCase(String status);

}
