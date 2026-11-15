package com.Project.JobApplicationTracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.JobApplicationTracker.entities.JobApplication;
import com.Project.JobApplicationTracker.service.JobApplicationService;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "http://localhost:5173")
public class JobApplicationController {

	private final JobApplicationService jobApplicationService;

	public JobApplicationController(JobApplicationService jobApplicationService) {
		this.jobApplicationService = jobApplicationService;
	}

	@PostMapping
	public JobApplication addApplication(@RequestBody JobApplication job) {
		return jobApplicationService.addApplication(job);
	}

	@GetMapping
	public List<JobApplication> getAllApplications() {
		return jobApplicationService.getAllApplications();
	}

	@GetMapping("/status/{status}")
	public List<JobApplication> getByStatus(@PathVariable String status) {
		return jobApplicationService.getByStatus(status);
	}

	@PutMapping("/{id}")
	public JobApplication updateApplication(@PathVariable Long id, @RequestBody JobApplication job) {
		return jobApplicationService.updateApplication(id, job);
	}

	@DeleteMapping("/{id}")
	public void deleteApplication(@PathVariable Long id) {
		jobApplicationService.deleteApplication(id);
	}

}
