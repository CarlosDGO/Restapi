package com.CarlosDGO.firstjobapp.Company.impl;

import com.CarlosDGO.firstjobapp.Company.Company;
import com.CarlosDGO.firstjobapp.Company.CompanyRepository;
import com.CarlosDGO.firstjobapp.Company.CompanyService;
import com.CarlosDGO.firstjobapp.job.Job;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Company> companyOptional= companyRepository.findById(id);
        if (companyOptional.isPresent()){
            Company companyToUpdate=companyOptional.get();
            companyToUpdate.setDescription(company.getDescription());
            companyToUpdate.setName(company.getName());
            companyToUpdate.setJobs(company.getJobs());
            companyRepository.save(companyToUpdate);
            return true;
        }else {
            return false;
        }

    }

}
