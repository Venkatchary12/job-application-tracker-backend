package com.Project.JobApplicationTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobApplicationTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobApplicationTrackerApplication.class, args);
	}

}


/*
POST /companies → Add a new company
GET /companies → Retrieve all companies

📌 Job Application Endpoints
POST /applications → Add a new job application
GET /applications → Retrieve all job applications
GET /applications/status/{status} → Retrieve job applications filtered by status
*/