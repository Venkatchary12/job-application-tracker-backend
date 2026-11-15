package com.Project.JobApplicationTracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Project.JobApplicationTracker.entities.Company;
import com.Project.JobApplicationTracker.exception.ResourceNotFoundException;
import com.Project.JobApplicationTracker.repository.CompanyRepository;


@Service
public class CompanyServiceImpl implements CompanyService{
	
	
	private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

	@Override
	public Company addCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	@Override
	 public Company updateCompany(Long id, Company company) {
        return companyRepository.findById(id)
                .map(existingCompany -> {
                    existingCompany.setCompanyName(company.getCompanyName());
                    existingCompany.setLocation(company.getLocation());
                    existingCompany.setWebsite(company.getWebsite());
                    return companyRepository.save(existingCompany);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Company not found with id " + id));
    }

	@Override
	public void deleteCompany(Long id) {
	    if (!companyRepository.existsById(id)) {
	        throw new ResourceNotFoundException("Company not found with id " + id);
	    }
	    companyRepository.deleteById(id);
	}


}
