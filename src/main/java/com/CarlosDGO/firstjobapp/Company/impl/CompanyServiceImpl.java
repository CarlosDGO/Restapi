package com.CarlosDGO.firstjobapp.Company.impl;

import com.CarlosDGO.firstjobapp.Company.Company;
import com.CarlosDGO.firstjobapp.Company.CompanyRepository;
import com.CarlosDGO.firstjobapp.Company.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}

