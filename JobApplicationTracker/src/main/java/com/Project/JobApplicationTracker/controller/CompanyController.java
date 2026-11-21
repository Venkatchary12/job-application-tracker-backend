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

import com.Project.JobApplicationTracker.entities.Company;
import com.Project.JobApplicationTracker.service.CompanyService;


@RestController
@RequestMapping("/companies")
public class CompanyController {

	private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

	@PostMapping
	public Company addCompany(@RequestBody Company company) {
		return companyService.addCompany(company);
	}
	
	
	@GetMapping
	public List<Company> getAllCompanies() {
		return companyService.getAllCompanies();
	}
	
	
	@PutMapping("/{id}")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company company) {
        return companyService.updateCompany(id, company);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }

}
