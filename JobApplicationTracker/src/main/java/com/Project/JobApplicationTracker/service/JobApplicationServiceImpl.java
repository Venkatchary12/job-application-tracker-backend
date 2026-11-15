package com.Project.JobApplicationTracker.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.Project.JobApplicationTracker.entities.JobApplication;
import com.Project.JobApplicationTracker.exception.ResourceNotFoundException;
import com.Project.JobApplicationTracker.repository.JobApplicationRepository;

@Service
public class JobApplicationServiceImpl implements JobApplicationService{
	
    private final JobApplicationRepository jobApplicationRepository;

    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
        this.jobApplicationRepository = jobApplicationRepository;
    }

	@Override
	public JobApplication addApplication(JobApplication job) {
		
		return jobApplicationRepository.save(job);
	}

	@Override
	public List<JobApplication> getAllApplications() {
		
		return jobApplicationRepository.findAll();
	}

	@Override
	public List<JobApplication> getByStatus(String status) {
	    return jobApplicationRepository.findByStatusIgnoreCase(status);
	}

	@Override
	public JobApplication updateApplication(Long id, JobApplication updatedApplication) {
	    JobApplication existing = jobApplicationRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("Application not found"));

	    if (updatedApplication.getJobRole() != null) {
	        existing.setJobRole(updatedApplication.getJobRole());
	    }
	    if (updatedApplication.getInterviewDate() != null) {
	        existing.setInterviewDate(updatedApplication.getInterviewDate());
	    }
	    if (updatedApplication.getAppliedDate() != null) {
	        existing.setAppliedDate(updatedApplication.getAppliedDate());
	    }
	    if (updatedApplication.getStatus() != null) {
	        existing.setStatus(updatedApplication.getStatus());
	    }
	    if (updatedApplication.getCompany() != null) {
	        existing.setCompany(updatedApplication.getCompany());
	    }

	    return jobApplicationRepository.save(existing);
	}

	@Override
	public void deleteApplication(Long id) {
	    if (!jobApplicationRepository.existsById(id)) {
	        throw new ResourceNotFoundException("Job Application not found with id " + id);
	    }
	    jobApplicationRepository.deleteById(id);
	}
}
