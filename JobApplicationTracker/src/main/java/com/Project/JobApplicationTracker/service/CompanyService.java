package com.Project.JobApplicationTracker.service;

import java.util.List;

import com.Project.JobApplicationTracker.entities.Company;

public interface CompanyService {
	
	Company addCompany( Company company);
	
	List<Company> getAllCompanies();
	
	Company updateCompany(Long id, Company company);
	 
	void deleteCompany(Long id);

}
