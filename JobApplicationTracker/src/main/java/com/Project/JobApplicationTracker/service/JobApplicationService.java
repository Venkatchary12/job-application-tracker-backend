package com.Project.JobApplicationTracker.service;

import java.util.List;

import com.Project.JobApplicationTracker.entities.JobApplication;

public interface JobApplicationService {
	
	JobApplication addApplication(JobApplication job);
	
	List<JobApplication> getAllApplications();
	
	List<JobApplication> getByStatus(String status);
	
	JobApplication updateApplication(Long id, JobApplication job);
	
    void deleteApplication(Long id);

}
