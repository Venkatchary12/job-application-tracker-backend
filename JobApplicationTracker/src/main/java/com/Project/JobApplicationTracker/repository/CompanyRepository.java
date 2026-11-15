package com.Project.JobApplicationTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Project.JobApplicationTracker.entities.Company;


public interface CompanyRepository extends JpaRepository<Company, Long>{

}
